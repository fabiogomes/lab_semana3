use spring_comex;

select pdd.id, pdd.datacadastro, pdd.valortotal,  pdd.desconto, itp.id, p.nome, cat.nome, itp.quantidade, p.preco, ((1+itp.desconto)*itp.quantidade*p.preco), c.id, c.nome
from item_pedido itp
join pedido pdd
on itp.pedido_id = pdd.id
join produto p
on itp.produto_id = p.id
join cliente c
on pdd.cliente_id = c.id
join categoria cat
on  p.categoria_id = cat.id
#where pdd.id = 5;

   @Query("SELECT new com.srmasset.comex.springboot.api.core.vo.DetalhesPedido(" +
            "pdd.id, pdd.datacadastro, pdd.valorTotal,  pdd.desconto, itp.id, p.nome, cat.nome, itp.quantidade, p.preco, ((1+itp.desconto)*itp.quantidade*p.preco), c.id, c.nome) " +
            "from ItemDePedido itp " +
            "join itp.pedido pdd " +
            "join itp.produto p " +
            "join pdd.cliente c " +
            "join p.categoria cat " +
            "where pdd.id = :id")