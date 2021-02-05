package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutos {

    private List<Produto> lista;

    public ListaProdutos() {
        lista = new ArrayList<>();
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }



}
