package br.dev.rvz;

public class Main {

    public static void main(String[] args) {
        boolean run = true;
        ListaProdutos listaProdutos = new ListaProdutos();
        int option;
        IO.out("Controle de estoque - Lista de supermercados");

        while(run) {
            IO.out("1. Adicionar um produto\n2. Pesquisar um produto por nome\n3. Sair do programa.");
            option = IO.input().nextInt();

            if (option == 1) {
                Produto produto = new Produto();
                IO.out("Digite o nome, data de vencimento, preço e quantidade em estoque do produto!");
                produto.setNome(IO.input().nextLine());
                produto.setDataVencimento(IO.input().nextLine());
                produto.setPreco(IO.input().nextDouble());
                produto.setQuantidadeEmEstoque(IO.input().nextInt());


            } else if (option == 2) {

            } else if (option == 3) {
                run = false;
            } else {
                IO.out("oção inválida");
            }
        }

    }
}
