package com.sd.filaveiculos.consumidor;

import com.sd.filaveiculos.veiculo.Veiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
// import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumidor {

    private static final String URL_BROKER = "tcp://localhost:61616";
    private static final String NOME_FILA = "FILA_VEICULOS";
    private static final String URL_BD = "jdbc:h2:~/veiculos";

    public static void main(String[] args) throws JMSException, SQLException {
        
        Connection connection = DriverManager.getConnection(URL_BD, "sa", "");

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(URL_BROKER);
        QueueConnectionFactory queueConnectionFactory = (QueueConnectionFactory) connectionFactory;

        QueueConnection queueConnection = queueConnectionFactory.createQueueConnection();
        QueueSession queueSession = queueConnection.createQueueSession(false, QueueSession.AUTO_ACKNOWLEDGE);
        Queue queue = queueSession.createQueue(NOME_FILA);

        QueueReceiver receiver = queueSession.createReceiver(queue);
        receiver.setMessageListener(message -> {
            
            try {
                ObjectMessage objectMessage = (ObjectMessage) message;

                Veiculo veiculo = (Veiculo) objectMessage.getObject();

                System.out.println("RECEBENDO MENSAGEM: " + veiculo.toString());

                PreparedStatement statement = connection.prepareStatement(
                        "INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES (?, ?, ?, ?, ?)");

                statement.setString(1, veiculo.getNomeCliente());
                statement.setString(2, veiculo.getMarcaModeloVeiculo());
                statement.setInt(3, veiculo.getAnoModelo());
                statement.setDouble(4, veiculo.getValorVenda());
                statement.setDate(5, new java.sql.Date(veiculo.getDataPublicacao().getTime()));
                statement.executeUpdate();
                
            } catch (SQLException | JMSException e) {
                e.printStackTrace();
            }
        });

        queueConnection.start();

        System.out.println("CONSUMIDOR INICIADO...");

        while (true) {

        }
    }
}
