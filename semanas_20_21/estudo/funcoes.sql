USE SUCOS_VENDAS;

SELECT * FROM TABELA_DE_CLIENTES;

SELECT NOME, LOWER(NOME) AS NOME_MINUSCULO FROM TABELA_DE_CLIENTES;

SELECT NOME, LOWER(NOME) AS NOME_MINUSCULO, UPPER(NOME) AS NOME_MAIUSCULO FROM TABELA_DE_CLIENTES;

SELECT NOME, CONCAT(ENDERECO_1, ' ', BAIRRO, ' ', CIDADE, ' ', ESTADO, ' ', CEP, ' - ', CEP) AS ENDERECO_COMPLETO
FROM  TABELA_DE_CLIENTES;

SELECT NOME, ENDERECO_1 + ' ' + BAIRRO + ' ' + CIDADE + ' ' + ESTADO + ' ' + CEP + ' - ' + CEP AS ENDERECO_COMPLETO
FROM  TABELA_DE_CLIENTES;

SELECT * FROM TABELA_DE_PRODUTOS;

SELECT NOME_DO_PRODUTO, LEFT(NOME_DO_PRODUTO, 3) AS TRES_PRIMEIROS_CHAR FROM TABELA_DE_PRODUTOS;

SELECT TAMANHO, REPLACE((REPLACE(TAMANHO, 'Litros', 'L')), 'Litro', 'L') AS TAMANHO_MODIFICADO FROM TABELA_DE_PRODUTOS;

SELECT NOME, CHARINDEX(' ', NOME, 1) FROM TABELA_DE_CLIENTES;

SELECT NOME, SUBSTRING(NOME, 1, CHARINDEX(' ', NOME, 1)) FROM TABELA_DE_CLIENTES;

SELECT DATEADD(DAY, 30, '2020-01-01'); --adiciona uma data a outra

SELECT DATEDIFF(DAY, '2020-01-01', '2021-01-01');	-- mostra a diferença entre as datas

SELECT DATEPART(DAY, '2022-01-01'); --mostra uma parte selecionada da data

SELECT DATEPART(YEAR, '2022-01-01');--mostra uma parte selecionada da data

SELECT GETDATE(); --pega a data atual do sistema

SELECT DAY('2022-02-03'); -- pega uma parte da data, possiveis DAY(), MONTH(), YAR

SELECT ISDATE('2022-02-03'); -- retorna 1 se o valor for uma data valida;

SELECT DATETIMEFROMPARTS(year, month, day, hour, minute, second, milliseconds);  --retorna um valor datetime çpara argumentos de data e hora especificados

SELECT DATETIMEFROMPARTS(2022, 02, 03, 15 , 34, 22, 30);

--Exemplos

SELECT GETDATE() AS DATA_HOJE, DATEADD(DAY, 10, GETDATE()) AS DATA_DAQUI_10DIAS; --soma 10 dias a data atual

SELECT GETDATE() AS DATA_HOJE, DATEADD(DAY, -42, GETDATE()) AS DATA_DAQUI_MENOS42DIAS; --subtrai 42 dias da data atual

SELECT DATEDIFF(DAY, '2023-01-01', GETDATE()); --Diferença de tempo do começo do ano;

SELECT DATEDIFF(MONTH, '2023-01-01', GETDATE()); --Diferença de tempo do começo do ano;

SELECT DATEDIFF(HOUR, '2023-01-01', GETDATE()); --Diferença de tempo do começo do ano;

SELECT GETDATE() DATA_HOJE,  DATEPART(DAY, GETDATE()) AS DIA_DE_HOJE; --Mostra o dia de hoje;

SELECT ISDATE(DATETIMEFROMPARTS(2022, 02, 28, 00, 00, 00, 00)); --testa para saber se um valor é uma data

SELECT NOME + ' nasceu em ' + 
DATENAME (WEEKDAY,DATA_DE_NASCIMENTO) + ',' +
DATENAME (DAY,DATA_DE_NASCIMENTO) + ' de ' +
DATENAME(MONTH, DATA_DE_NASCIMENTO) + ' de ' +
DATENAME(YEAR, DATA_DE_NASCIMENTO) AS DATA_EXTENSO
FROM TABELA_DE_CLIENTES;

-- funçõe numericas

SELECT ROUND(32.333333, 3) --função para arredondamento numerico

SELECT CEILING(32.33333) -- retorna o menor inteiro maior que ou igual a expressao numerica

SELECT POWER(2, 10) --retorna uma potencia de um numero

SELECT EXP(10) -- retorna o exponencia de um numero

SELECT SQRT(12) -- raiz quadrada

SELECT SIGN(2) -- retorna 1 para numeros positivos ou 0 para numeros negativos

SELECT ABS(2) -- retorna o valor absoluta de expressao numerica especificada

SELECT Numero % Numero2; -- calculo o resto de uma divisao

SELECT YEAR(DATA_VENDA) AS ANO, FLOOR(SUM(IMPOSTO * (QUANTIDADE * PRECO))) 
FROM NOTAS_FISCAIS NF
INNER JOIN ITENS_NOTAS_FISCAIS INF ON NF.NUMERO = INF.NUMERO
WHERE YEAR(DATA_VENDA) = 2016
GROUP BY YEAR(DATA_VENDA);

-- FUNÇÔES DE CONVERSAO

-- CAST e CONVER: Essas funções convertem uma expressao de um tipo de dados em outro

SELECT CONVERT(data, mascara)   --Converte uma data em texto, verificar tabela de conversoes

SELECT CAST() --Conversao de numeros para numeros, verificar tabela de conversoes

SELECT CONVERT(VARCHAR(10), GETDATE(), 121);

SELECT CONVERT(VARCHAR(25), GETDATE(), 121);

SELECT * FROM TABELA_DE_CLIENTES;

SELECT DATA_DE_NASCIMENTO, CONVERT(VARCHAR(25), DATA_DE_NASCIMENTO, 121) -- formas diferentes de exibição da data
FROM TABELA_DE_CLIENTES;

SELECT DATA_DE_NASCIMENTO, CONVERT(VARCHAR(25), DATA_DE_NASCIMENTO, 106) -- formas diferentes de exibição da data
FROM TABELA_DE_CLIENTES;

SELECT NOME_DO_PRODUTO, PRECO_DE_LISTA FROM TABELA_DE_PRODUTOS;

SELECT NOME_DO_PRODUTO, CONCAT('O preço de lista é: ', CAST(PRECO_DE_LISTA AS VARCHAR(10))) AS PRECO FROM TABELA_DE_PRODUTOS;
-- Concatena valores de texto, faz um cast de um tipo float para varchar para exibição

SELECT 'O cliente ' + TC.NOME + ' comprou R$ ' + 
TRIM(STR(SUM(INF.QUANTIDADE * INF.PRECO) ,10,2)) + ' no ano de ' + DATENAME(YEAR, NF.DATA_VENDA)
FROM NOTAS_FISCAIS NF
INNER JOIN ITENS_NOTAS_FISCAIS INF ON NF.NUMERO = INF.NUMERO
INNER JOIN TABELA_DE_CLIENTES TC ON NF.CPF = TC.CPF
WHERE YEAR(NF.DATA_VENDA) = '2016'
GROUP BY TC.NOME, NF.DATA_VENDA;

/**Elaborar consultas avançadas usando funções no SQL Server ;
Identificar as funções de texto LOWER, UPPER, CONCAT, LEFT e REPLACE;
Utilizar datas com as funções de data GETDATE e ISDATE;
Calcular funções numéricas ROUND, CEILING, FLOOR, POWER, EXP, SQRT e ABS;
Utilizar a função CONVERT para conversão de tipo de dados.
**/

