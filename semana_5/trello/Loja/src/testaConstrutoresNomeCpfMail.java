public class testaConstrutoresNomeCpfMail {
    public static void main(String[] args) {
        Cliente paula = new Cliente("paula", "111111111-1");
        paula.setMail("paula@gmail.com");
        paula.setNome("Paula Machado");
        paula.setProfissao("Bancaria");
        paula.setTelefone("11 1111-1111");

        System.out.println("O objeto cliente paula é: " + paula);
        System.out.println("O objeto endereco de paula é: " + paula.getEndereco());

        Cliente sara = new Cliente("sara", "222222222-2","paula@gmail.com");
        paula.setNome("Sara Cruz");
        paula.setProfissao("Quimica");
        paula.setTelefone("22 2222-2222");

        System.out.println("O objeto cliente sara é: " + sara);
        System.out.println("O objeto endereco de sara é: " + sara.getEndereco());
    }
}
