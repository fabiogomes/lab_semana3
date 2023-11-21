USE spring_comex;

SELECT c.nome AS NOME, COUNT(pdd.cliente_cpf) AS QTD_PEDIDOS, SUM(pdd.valortotal) AS VALOR_TOTAL
FROM pedido pdd
JOIN cliente c
ON pdd.cliente_cpf = c.cpf
GROUP BY c.nome
ORDER BY SUM(pdd.valortotal) DESC;