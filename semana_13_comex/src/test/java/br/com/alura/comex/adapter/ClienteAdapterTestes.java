package br.com.alura.comex.adapter;

import br.com.alura.comex.modelo.ClienteSimples;
import br.com.alura.comex.adapter.ClienteAdapter;
import org.junit.jupiter.api.Test;

class ClienteAdapterTestes {

//    private br.com.alura.comex.modelo.Cliente cliente;
//    public br.com.alura.comex.adapter.ClienteAdapterTestes(br.com.alura.comex.modelo.Cliente cliente){
//        this.cliente = cliente;
//    }
    @Test
        public void Teste(){
        ClienteSimples fabio = new ClienteSimples();
        fabio.setNome("Fulano");
        fabio.setCpf("12345678911");
        fabio.setIdade(45);

        //List<br.com.alura.comex.modelo.ClienteSimples> lista = Arrays.asList(fabio);
//        Gson gson = new Gson();
//        String jsonString = gson.toJson(fabio);
//        System.out.println(jsonString);
//        Assertions.assertEquals(jsonString, "");

        ClienteAdapter clienteAdapter = new ClienteAdapter();

        System.out.println(clienteAdapter.retornaJson(fabio));
    }
}

