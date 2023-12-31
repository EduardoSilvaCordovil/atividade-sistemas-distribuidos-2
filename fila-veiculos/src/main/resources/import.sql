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

