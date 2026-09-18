package Atividades.Pedidos_6;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private double valorTotal;
    private String status;

    public Pedido(int numeroPedido, String cliente, double valorTotal) {
        setNumeroPedido(numeroPedido);
        setCliente(cliente);
        setValorTotal(valorTotal);
        this.status = "Recebido";
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal > 0) {
            this.valorTotal = valorTotal;
        } else {
            System.out.println("Erro: O valor deve ser maior que zero!");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("Recebido") || status.equals("Preparando") ||
                status.equals("Pronto") || status.equals("Entregue") || status.equals("Cancelado")) {
            this.status = status;
        } else {
            System.out.println("Erro: Status inválido!");
        }
    }

    public void avancarStatus() {
        if (this.status.equals("Recebido")) {
            this.status = "Preparando";
            System.out.println("Status alterado para: Preparando");
        } else if (this.status.equals("Preparando")) {
            this.status = "Pronto";
            System.out.println("Status alterado para: Pronto");
        } else if (this.status.equals("Pronto")) {
            this.status = "Entregue";
            System.out.println("Status alterado para: Entregue");
        } else if (this.status.equals("Entregue")) {
            System.out.println("O pedido já foi entregue!");
        } else if (this.status.equals("Cancelado")) {
            System.out.println("Não é possível avançar um pedido cancelado!");
        }
    }

    public void cancelarPedido() {
        if (!this.status.equals("Entregue")) {
            this.status = "Cancelado";
            System.out.println("Pedido cancelado com sucesso!");
        } else {
            System.out.println("Não é possível cancelar um pedido que já foi entregue!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("=== Informações do Pedido ===");
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.printf("Valor Total: R$ %.2f%n", valorTotal);
        System.out.println("Status: " + status);
    }
}