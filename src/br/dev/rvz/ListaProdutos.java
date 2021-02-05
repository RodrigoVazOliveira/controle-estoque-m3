package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutos {

    private List<Produto> lista;

    public ListaProdutos() {
        lista = new ArrayList<>();
    }

    public List<Produto> getLista() {
        return lista;
    }

    public void adicionarProduto(Produto produto) {
        lista.add(produto);
    }

    public void pesquisar(String nome) {
        for (Produto produto: lista) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                IO.out("Produto encontrado: " + produto);
            }
        }
    }

    public Produto getItem(String nome) {
        for (Produto produto: lista) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }

        }
        return null;
    }

    public void removeItem(Produto produto) {
        lista.remove(produto);
    }

}
