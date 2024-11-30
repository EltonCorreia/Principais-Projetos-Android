CREATE database exemplo
GO
USE Exemplo
GO
CREATE TABLE [dbo].[login](
	[id_login] [int] IDENTITY(1,1) NOT NULL,
	[usuario] [varchar](30) NULL,
	[senha] [varchar](30) NULL,
	[status] [char](1) NULL,
 CONSTRAINT [PK_login] PRIMARY KEY CLUSTERED 
(
	[id_login] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
insert into login (usuario, senha, status) values ('maria', '1234','a')
insert into login (usuario, senha, status) values ('jbernardo', 'aa33bb','a')
insert into login (usuario, senha, status) values ('aalberto', 'a1b2','o')
insert into login (usuario, senha, status) values ('brand', 'feira','o')
insert into login (usuario, senha, status) values ('rubens', '112233','c')
insert into login (usuario, senha, status) values ('luiz', '2233','c')
insert into login (usuario, senha, status) values ('rita', 'A1b2@','c')
insert into login (usuario, senha, status) values ('rafaela', '114433','c')
insert into login (usuario, senha, status) values ('paulo', '332a1c','c')
insert into login (usuario, senha, status) values ('rafael', 'abc123','c')
insert into login (usuario, senha, status) values ('nayara', '4455bb','c')
insert into login (usuario, senha, status) values ('felipe', 'zero','c')
insert into login (usuario, senha, status) values ('ana', '000011','c')
select * from login