# Práticas Fila de Mensagem e Componentes Spring Web

O projeto "Práticas Fila de Mensagem e Componentes Spring Web" se concentra em práticas de desenvolvimento com o uso de fila de mensagens e componentes Spring Web.

Desenvolvido por: ***[Eduarda Reis](https://github.com/EduardaReis3332)*** e ***Eduardo Cordovil***

## Como rodar e executar as atividades?

Para rodar os testes, rode o seguinte comando
Abra as pastas ***"fila-veiculos/src/main/java/com/sd/filaveiculos/consumidor"*** e execute os arquivos:
```
FilaVeiculosApplication | Podutor | Consumidor
```
Depois que à aplicação estiver no ar, acesse a seguinte url:
```
http://localhost:8080/veiculos
```
Utilize o Activemq para vizualizar a fila que foi criada.
```
/opt/activemq/bin/activemq start

```
Quando o activemq estiver funcionando, acesse-o pela url:
```
http://localhost:8161/admin

usuário: admin
senha: admin
```
Caso o programa não crie o banco de dados. Vá até o arquivo import.sql copie e cole o código para o banco de dados H2, que deve conter as seguintes configurações:
```
Setting Name: Generic H2 (Server)
Setting Name: org.h2.Driver
JDBC URL: jdbc:h2:~/test
User Name: sa
```
Para acessar o banco de dados, acesse a url: 
```
http://localhost:8080/h2-console
```
e inclua os seguintes comandos:
```sql
CREATE TABLE veiculo (
id bigint generated by default as identity,
nomeCliente varchar(255),
marcaModeloVeiculo varchar(255),
anoModelo integer not null,
valorVenda double not null,
dataPublicacao timestamp,
primary key (id)
);

INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('João', 'Fiat Uno', 2022, 20000.0, '2021-09-20 10:30:00');
INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('Maria', 'Ford Ka', 2021, 25000.0, '2021-09-20 11:30:00');
INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('José', 'Chevrolet Onix', 2020, 30000.0, '2021-09-20 12:30:00');
INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('Ana', 'Volkswagen Gol', 2019, 28000.0, '2021-09-20 13:30:00');
INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('Luiz', 'Renault Kwid', 2022, 32000.0, '2021-09-20 14:30:00');
INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('Carla', 'Fiat Argo', 2018, 22000.0, '2021-09-20 15:30:00');
INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('Pedro', 'Toyota Corolla', 2021, 50000.0, '2021-09-20 16:30:00');
INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('Mariana', 'Honda Civic', 2017, 40000.0, '2021-09-20 17:30:00');
INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('Rafael', 'Hyundai HB20', 2016, 27000.0, '2021-09-20 18:30:00');
INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('Julia', 'Nissan Kicks', 2023, 45000.0, '2021-09-20 19:30:00');
INSERT INTO veiculo (nomeCliente, marcaModeloVeiculo, anoModelo, valorVenda, dataPublicacao) VALUES ('Lucas', 'Jeep Renegade', 2020, 38000.0, '2021-09-20 20:30:00');
```
# 💻 Tech Stack:
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Thymeleaf](https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white) ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
# 📊 GitHub Stats:
![](https://github-readme-stats.vercel.app/api?username=EduardoSilvaCordovil&theme=radical&hide_border=false&include_all_commits=true&count_private=false)<br/>
![](https://github-readme-streak-stats.herokuapp.com/?user=EduardoSilvaCordovil&theme=radical&hide_border=false)<br/>
![](https://github-readme-stats.vercel.app/api/top-langs/?username=EduardoSilvaCordovil&theme=radical&hide_border=false&include_all_commits=true&count_private=false&layout=compact)

## 🏆 GitHub Trophies
![](https://github-profile-trophy.vercel.app/?username=EduardoSilvaCordovil&theme=radical&no-frame=true&no-bg=false&margin-w=4)

### ✍️ Random Dev Quote
![](https://quotes-github-readme.vercel.app/api?type=horizontal&theme=radical)

### 🔝 Top Contributed Repo
![](https://github-contributor-stats.vercel.app/api?username=EduardoSilvaCordovil&limit=5&theme=radical&combine_all_yearly_contributions=true)

---
<p align="left"> <img src="https://komarev.com/ghpvc/?username=eduardosilvacordovil&label=Profile%20views&color=0e75b6&style=flat" alt="eduardosilvacordovil" /> </p>

<!-- Proudly created with GPRM ( https://gprm.itsvg.in ) -->
