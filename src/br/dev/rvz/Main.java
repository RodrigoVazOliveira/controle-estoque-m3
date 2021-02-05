package br.dev.rvz;

public class Main {

    public static void main(String[] args) {
        boolean run = true;
        Estoque estoque = new Estoque();
        int option;
        IO.out("Controle de estoque - Lista de supermercados");

        while(run) {
            IO.out("1. Adicionar um produto\n2. Pesquisar um produto por nome\n3. Sair do programa.");
            option = IO.input().nextInt();
            if (option == 1) {
                IO.out("Digite o nome, data de vencimento, preço e quantidade em estoque do produto!");
                estoque.adicionarProduto(IO.input().nextLine(), IO.input().nextLine(), IO.input().nextDouble(),IO.input().nextInt());
                IO.out("Produto adicionado!");
            } else if (option == 2) {
                IO.out("Digite o noem do produto:");
                String nome = IO.input().nextLine();
                listaProdutos.pesquisar(nome);
            } else if (option == 3) {
                run = false;
            } else {
                IO.out("oção inválida");
            }
        }

    }
}
