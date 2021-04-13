package br.dev.rvz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EstoqueTest {

    private Estoque estoque;

    @Before
    public void setup() {
        estoque = new Estoque();
    }

    @Test
    public void testarBuscaDeProduto() {
        estoque.adicionarProduto(
                "Produto 1",
                "12-12-2021",
                20.00,
                20
        );

        Assert.assertEquals(estoque.getItem("Produto 1"), estoque.getItem("Produto 1"));
    }

    @Test
    public void testarAlteracaoDeQuantidadeDeProduto() {
        estoque.adicionarProduto(
                "Produto 1",
                "12-12-2021",
                20.00,
                20
        );
        Produto produto = estoque.getItem("Produto 1");

        estoque.altearQuantidade(produto, 5);
        Assert.assertEquals(produto.getQuantidadeEmEstoque(), 25);
    }
}
