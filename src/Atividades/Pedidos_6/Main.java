package Atividades.Pedidos_6;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(101, "Guilherme Henrique", 85.50);

        pedido.exibirInformacoes();

        System.out.println();

        pedido.avancarStatus();
        pedido.avancarStatus();

        System.out.println();

        pedido.exibirInformacoes();

        System.out.println("\n--- Testando Validações ---");
        pedido.setValorTotal(-20.0);
        pedido.setStatus("Inexistente");

        System.out.println();

        pedido.cancelarPedido();
        pedido.avancarStatus();
    }
}