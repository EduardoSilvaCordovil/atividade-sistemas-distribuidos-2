package com.sd.filaveiculos.produtor;

import com.sd.filaveiculos.veiculo.Veiculo;
import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Produtor {

    private static final String URL_BROKER = "tcp://localhost:61616";
    private static final String NOME_FILA = "FILA_VEICULOS";

    public static void main(String[] args) throws JMSException {
        
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(URL_BROKER);
        QueueConnectionFactory queueConnectionFactory = (QueueConnectionFactory) connectionFactory;
        QueueConnection queueConnection = queueConnectionFactory.createQueueConnection();
        QueueSession queueSession = queueConnection.createQueueSession(false, QueueSession.AUTO_ACKNOWLEDGE);
        Queue queue = queueSession.createQueue(NOME_FILA);
        javax.jms.QueueSender sender = queueSession.createSender(queue);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("Digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Digite a marca e modelo do veículo:");
            String marcaModeloVeiculo = scanner.nextLine();
            System.out.println("Digite o ano do modelo:");
            int anoModelo = scanner.nextInt();
            System.out.println("Digite o valor de venda:");
            double valorVenda = scanner.nextDouble();
            scanner.nextLine();

            Veiculo veiculo = new Veiculo(nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda);
            ObjectMessage message = queueSession.createObjectMessage();
            message.setObject((Serializable) veiculo);
            message.setJMSExpiration(new Date().getTime() + 1000);
            System.out.println("ENVIANDO MENSAGEM: " + message.getObject().toString());
            sender.send(message);

            System.out.println("Deseja adicionar outro veículo? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equals("n")) {
                break;
            }
        }

        queueSession.close();
        queueConnection.close();
    }
}
