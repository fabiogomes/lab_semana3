package br.com.alura.comex.adapter;
import br.com.alura.comex.modelo.Cliente;
import br.com.alura.comex.modelo.ClienteSimples;
import com.google.gson.Gson;

public class ClienteAdapter {
    public String retornaJson(ClienteSimples cliente){
        Gson stringJson = new Gson();
        return stringJson.toJson(cliente);
    }
}
