package br.com.comex.domain;

import java.util.Set;

public interface DAO <T> {
    void adicionar (T t);

    void atualizar();

    void remover();

    <T> T buscaPorID(Integer cod);

    Set<T> listarTodos();
}
