public class crieClasseClienteEEndereco {
    public static void main(String[] args) {
        Cliente paula = new Cliente("Paula Machado", "111111111-1");
        paula.setMail("paula@gmail.com");
        paula.setProfissao("Bancaria");
        paula.setTelefone("11 1111-1111");

        System.out.println("O objeto cliente paula é: " + paula);
        System.out.println("O objeto endereco de paula é: " + paula.getEndereco());
    }
}
