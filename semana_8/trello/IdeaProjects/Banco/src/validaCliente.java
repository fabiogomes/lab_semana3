public class validaCliente {
    public static void main(String[] args) {
        //testa vazio
        Cliente david = new Cliente("david");
        //david.setNome("");

        //testa nulo
        david.setNome(null);
    }
}
