-----------------------------------------------------------------
-- Gerenciando imagens no SQL:
-----------------------------------------------------------------
-- Banco de testes
create database exemplo
go
use exemplo
create table imagens (
	id int identity (1, 1) not null,
	nome_bd varchar(30) not null,
	telefone_bd varchar(30) not null,
	imagem_bd varbinary(max) not null
)

-- Carregando uma imagem via t-sql (Transact-SQL)

insert into imagens (nome_bd, telefone_bd, imagem_bd) select 'Luciana','1196215545', *  from openrowset (bulk 'C:\imagem\naruto.jpg', single_blob) alciImagem
insert into imagens (nome_bd, telefone_bd, imagem_bd) select 'Luciano do YT','1196215545', *  from openrowset (bulk 'C:\imagem\monica.jpg', single_blob) alciImagem

--alciImagem (nome de correlação para conjunto de inserção (linha em massa))

-- Consultar imagens no banco:
select * from imagens


