USE LAB_COMEX;

CREATE TABLE CLIENTES (
	COD_CLIENTE BIGINT NOT NULL PRIMARY KEY,
	NOME VARCHAR(255) NOT NULL,
	EMAIL VARCHAR(100) NOT NULL,
	CPF VARCHAR(11) NOT NULL,
	TELEFONE1 VARCHAR(20),
	TELEFONE2 VARCHAR(20),
	ENDERECO VARCHAR(100),
	BAIRRO VARCHAR(200) NOT NULL,
	CIDADE VARCHAR(200) NOT NULL,
	UF VARCHAR(2) NOT NULL,
	CEP VARCHAR(8) NOT NULL,
	DATA_DE_NASCIMENTO DATE
);

INSERT INTO [CLIENTES] ([COD_CLIENTE],[NOME],[EMAIL],[CPF],[TELEFONE1],[TELEFONE2],[ENDERECO],[BAIRRO],[CIDADE],[UF],[CEP],[DATA_DE_NASCIMENTO]) VALUES
						(1,'Gusttavo Lima','gu@email.com.br','98767777771','(49) 9999999','(49) 7777777','Praça Doutor Castilho','Centro','Presidente Olegário','MG','38750000','1990-01-01'),
						(2,'Anitta','anitta@email.com.br','99767777771','(21) 9999999','(21) 7777777','Rua A','Honorio Gurgel','Rio de Janeiro','RJ','39750000','2000-01-01'),
						(3,'Luan Santana','luan@email.com.br','96667777771','(67) 9999999','(67) 7777777','Rua Bahia','Acropolis','Campo Grande','MS','39750000','2005-01-01'),
						(4,'Pitty','pitty@email.com.br','94018201899','(71) 6767676767','(71) 9111111','Rua do Dende','Acaraje','Salvador','BA','8770000','1977-08-07'),
						(5,'Caetano Veloso','oxi@email.com.br','92018201899','(71) 8888888','(71) 96764343','Rua do Abada','Veloso','Santo Amaro','BA','88750000','1942-08-07'),
						(6,'Gustavo Borges','borges@email.com.br','9999201899','(71) 56565656','(11) 99999991','Rua do Peitoral','Franco','Ribeirão Preto','SP','88750000','1972-12-02'),
						(7,'Chico Buarque','chico@email.com.br','92018201899','(21) 2222222','(21) 987787878','Rua do Calice','Catete','Rio de Janeiro','RJ','88750000','1944-06-19');

SELECT * FROM CLIENTES;