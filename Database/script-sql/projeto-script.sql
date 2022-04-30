create database projetointegrador_terceiro;
use projetointegrador_terceiro;

create table usuario(
	id_usuario int(3) primary key auto_increment not null,
    	nome_usuario varchar(60) not null,
  	email varchar(60) not null,
    	senha varchar(25) not null,
  	acesso enum('Gerente', 'Colaborador') not null
	
);

create table estoque(
	id_produto int(6) primary key not null auto_increment,
	nome_produto varchar(50) not null unique,
	quantidade int(11) not null,
	valor_unit decimal(9,2) null default '0.00'
    
);

create table cliente(
	id_cliente int(6) primary key not null auto_increment,
	nome varchar(60) not null,
	CPF varchar(11) unique not null,
	telefone varchar(13),
	email varchar(60)
);

create table pedido_de_venda(
	numero_pedido int(15) not null,
	quantidade_comprada int(11) not null,
	forma_de_pagamento enum('dinheiro','debito','credito') not null,
	FK_id_cliente int(5) not null,
	FK_id_produto int(5) not null
);

alter table pedido_de_venda add foreign key(FK_id_cliente) references cliente(id_cliente);
alter table pedido_de_venda add foreign key(FK_id_produto) references estoque(id_produto);

insert into usuario(nome_usuario,email,senha,acesso)values(
	'Rafaela Teixeira',
	'rafaela-teia@outlook.com.br',	
	'rafa123',
    'Gerente'
);
select * from cliente;
insert into usuario(nome_usuario,email,senha,acesso)values(
	'Guilherme',
	'guilhermealvez.1999@hotmail.com',	
	'guilherme123',
    'Colaborador'
);

insert into cliente(nome,CPF,telefone,email)values(
	'Jorge Silva',
	'50823031965',
    '11960256910',
    'jorge-oliveira@gmail.com.br'
);
