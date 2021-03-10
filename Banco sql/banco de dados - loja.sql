create database loja;
use loja;

create table clientes (
codigo int,
nome varchar(30) not null,
cpf varchar(15),
cidade varchar(30),
cep int,
endereco varchar(30),
uf varchar(10),
primary key(codigo)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;

create table pedido (
numero int not null,
prazo varchar(30),
primary key(numero)
) ENGINE=InnoDB DEFAULT CHARSET = UTF8;

create table produto (
codigo int not null,
valor Double(7,2),
descricao varchar(30),
primary key(codigo)
)ENGINE=InnoDB DEFAULT CHARSET = UTF8;

create table vendedor (
codigo int,
nome varchar(30),
sal Double(7,2),
primary key(codigo)
)ENGINE=InnoDB DEFAULT CHARSET = UTF8;
Describe vendedor;

 create table item_pedido (
 quantidade decimal(8,2) not null
 ) ENGINE=InnoDB DEFAULT CHARSET=UTF8;
 
 create table cadastro (
 usuario varchar(30),
 senha varchar(30),
 unique key (usuario)
 )ENGINE=InnoDB DEFAULT CHARSET=UTF8;

/* FOREIGN KEYS */
alter table pedido add cod_cliente int;
alter table pedido add cod_vendedor int;
alter table pedido add foreign key (cod_cliente) references clientes(codigo);
alter table pedido add foreign key (cod_vendedor) references vendedor(codigo);
alter table item_pedido add num_pedido int;
alter table item_pedido add cod_produto int;
alter table item_pedido add foreign key (num_pedido) references pedido(numero);
alter table item_pedido add foreign key (cod_produto) references produto(codigo);

insert into cadastro (usuario, senha) values ('teste', 123);




