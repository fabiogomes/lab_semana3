public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        }catch(Exception ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
//        try {
        	metodo2();
//        }catch (ArithmeticException ex){
//        	System.out.println("ArithmeticException");
//        	System.out.println(ex);
//        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("ini do metodo 2");
        metodo2();
        System.out.println("fim do metodo 2");
    }
}