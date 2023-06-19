public class repondeQuantidadeDeProdutos {
    public static void main(String[] args) {
        Produto calca = new Produto("calca");
        Produto camisa = new Produto("camisa");
        Produto meia = new Produto("meia");
        Produto blusa = new Produto("blusa");

        System.out.println("O objeto produto calca é: " + calca);
        System.out.println("O objeto produto camisa é: " + camisa);
        System.out.println("O objeto produto meia é: " + meia);
        System.out.println("O objeto produto blusa é: " + blusa);

        System.out.println("A quantidade de objetos criadas é de: " + Produto.getTotalItens());
    }
}
