package Atividades.Produtos_3;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", "Eletrônicos", 3500.00, 10);

        produto.exibirInformacoes();

        System.out.println();

        produto.entradaEstoque(5);
        produto.saidaEstoque(3);

        System.out.println();

        produto.exibirInformacoes();

        System.out.println("\n--- Testando Validações ---");
        produto.setPreco(-50.0);
        produto.setEstoque(-5);
        produto.saidaEstoque(20);
    }
}