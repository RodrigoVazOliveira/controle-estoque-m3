package br.dev.rvz;

public class MainMenu {
    private boolean run = true;
    private int option;
    private Estoque estoque;

    public MainMenu() {
        IO.out("Controle de estoque - Lista de supermercados");
        estoque = new Estoque();

        while(run) {
            IO.out("1. Adicionar um produto\n2. Pesquisar um produto por nome\n3. Adicionar quantiade do produto\n4. Diminuir quantidade do produto.\n5. Sair do programa.");
            option = IO.input().nextInt();
            menuOptions();
        }
    }

    private void adicionarProduto() {
        IO.out("Digite o nome, data de vencimento, preço e quantidade em estoque do produto!");
        estoque.adicionarProduto(IO.input().nextLine(), IO.input().nextLine(), IO.input().nextDouble(),IO.input().nextInt());
        IO.out("Produto adicionado!");
    }

    private void pesquisarProduto() {
        IO.out("Digite o noem do produto:");
        estoque.pesquisarProduto(IO.input().nextLine());
    }

    private void adicionarQuantidadeProduto() {
        IO.out("Qual produto deseja aumentar a quantidade?");
        Produto produto = estoque.getItem(IO.input().nextLine());

        if (produto != null) {
            produto = estoque.altearQuantidade(produto, 1);
        }

    }

    public void diminuirQuantidadeProduto() {
        IO.out("Qual produto deseja diminuir a quantidade?");
        Produto produto = estoque.getItem(IO.input().nextLine());
        if (produto != null) {
            produto = estoque.altearQuantidade(produto, -1);
        }

    }

    private void sair() {
        run = false;
    }

    private void menuOptions() {
        if (option == 1) {
            adicionarProduto();
        } else if (option == 2) {
            pesquisarProduto();
        } else if (option == 3) {
            adicionarQuantidadeProduto();
        } else if (option == 4) {
            diminuirQuantidadeProduto();
        } else if (option == 5) {
            sair();
        } else {
            IO.out("oção inválida");
        }
    }
}
