public class criaAClasseProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("camisa");
        produto.setDescricao("polo");
        produto.setPreco(40.0);
        produto.setQuantidade(2);

        System.out.println(produto);
        System.out.println(produto.getNome());
        System.out.println(produto.getDescricao());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());

    }
}