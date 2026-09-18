package Atividades.Eventos_9;

public class Evento {
    private String nomeEvento;
    private int capacidade;
    private int ingressosVendidos;
    private double precoIngresso;

    public Evento(String nomeEvento, int capacidade, double precoIngresso) {
        setNomeEvento(nomeEvento);
        setCapacidade(capacidade);
        setPrecoIngresso(precoIngresso);
        this.ingressosVendidos = 0;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("Erro: A capacidade deve ser maior que zero!");
        }
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        if (ingressosVendidos >= 0 && ingressosVendidos <= this.capacidade) {
            this.ingressosVendidos = ingressosVendidos;
        } else {
            System.out.println("Erro: Quantidade de ingressos vendidos inválida!");
        }
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        if (precoIngresso >= 0) {
            this.precoIngresso = precoIngresso;
        } else {
            System.out.println("Erro: O preço do ingresso não pode ser negativo!");
        }
    }

    public void venderIngresso(int quantidade) {
        if (quantidade > 0) {
            if (this.ingressosVendidos + quantidade <= this.capacidade) {
                this.ingressosVendidos += quantidade;
                System.out.println("Venda de " + quantidade + " ingresso(s) realizada com sucesso!");
            } else {
                System.out.println("Erro: Não é possível vender acima da capacidade máxima!");
            }
        } else {
            System.out.println("Erro: A quantidade deve ser maior que zero!");
        }
    }

    public void cancelarIngresso(int quantidade) {
        if (quantidade > 0 && quantidade <= this.ingressosVendidos) {
            this.ingressosVendidos -= quantidade;
            System.out.println("Cancelamento de " + quantidade + " ingresso(s) realizado com sucesso!");
        } else {
            System.out.println("Erro: Quantidade inválida para cancelamento!");
        }
    }

    public int mostrarVagasDisponiveis() {
        return this.capacidade - this.ingressosVendidos;
    }

    public void exibirInformacoes() {
        System.out.println("=== Informações do Evento ===");
        System.out.println("Nome do Evento: " + nomeEvento);
        System.out.println("Capacidade Máxima: " + capacidade);
        System.out.println("Ingressos Vendidos: " + ingressosVendidos);
        System.out.printf("Preço do Ingresso: R$ %.2f%n", precoIngresso);
        System.out.println("Vagas Disponíveis: " + mostrarVagasDisponiveis());
    }
}
