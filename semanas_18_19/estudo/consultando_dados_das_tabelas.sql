SELECT [CPF]
      ,[NOME]
      ,[ENDERECO1]
      ,[ENDERECO2]
      ,[BAIRRO]
      ,[CIDADE]
      ,[ESTADO]
      ,[CEP]
      ,[DATA DE NASCIMENTO]
      ,[IDADE]
      ,[SEXO]
      ,[LIMITE DE CREDITO]
      ,[VOLUME DE COMPRA]
      ,[PRIMEIRA COMPRA]
  FROM [TABELA DE CLIENTES]


  SELECT * FROM [TABELA DE CLIENTES];

  SELECT [NOME]  AS [NOME DO CLIENTE]
      ,[CPF] AS IDETIFICADOR
  FROM [TABELA DE CLIENTES]

  SELECT * FROM [TABELA DE PRODUTOS];

  DELETE FROM [TABELA DE PRODUTOS] WHERE [CODIGO DO PRODUTO] = '1000889';


  SELECT * FROM [TABELA DE PRODUTOS] WHERE [CODIGO DO PRODUTO] = '1000889';

    SELECT [CODIGO DO PRODUTO], [NOME DO PRODUTO] FROM [TABELA DE PRODUTOS] WHERE [CODIGO DO PRODUTO] = '1000889';

SELECT * FROM [TABELA DE PRODUTOS] WHERE SABOR = 'Uva';

SELECT * FROM [TABELA DE PRODUTOS] WHERE SABOR = 'Lim�o';

UPDATE [TABELA DE PRODUTOS] SET [PRECO DE LISTA] = 1.1*[PRECO DE LISTA]
WHERE SABOR = 'Lim�o';

DELETE FROM [TABELA DE PRODUTOS]
WHERE SABOR = 'Lim�o';

SELECT * FROM [TABELA DE PRODUTOS] WHERE SABOR = 'Lim�o';