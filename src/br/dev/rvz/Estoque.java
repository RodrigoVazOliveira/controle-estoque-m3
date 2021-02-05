package br.dev.rvz;

public class Estoque {

    private ListaProdutos lista;

    public Estoque() {
        lista = new ListaProdutos();
    }

    public void adicionarProduto(String nome, String dataVencimento, double preco, int quantidadeEmEstoque) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setDataVencimento(dataVencimento);
        produto.setPreco(preco);
        produto.setQuantidadeEmEstoque(quantidadeEmEstoque);
        lista.adicionarProduto(produto);
    }

    public void pesquisarProduto(String nome) {
        lista.pesquisar(nome);
    }
}
