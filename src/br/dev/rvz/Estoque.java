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

    public Produto getItem(String name) {
        return lista.getItem(name);
    }

    public void removeProduto(Produto produto) {
        lista.removeItem(produto);
    }

    public Produto altearQuantidade(Produto produto, int quantidade) {
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + quantidade);
        return produto;
    }

}
