package Atividades.Hotel;

public class Reserva {
    private String hospede;
    private int quarto;
    private int dias;
    private double valorDiaria;

    public Reserva(String hospede, int quarto, int dias, double valorDiaria) {
        setHospede(hospede);
        setQuarto(quarto);
        setDias(dias);
        setValorDiaria(valorDiaria);
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        if (dias > 0) {
            this.dias = dias;
        } else {
            System.out.println("Erro: A quantidade de dias deve ser maior que zero!");
        }
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria > 0) {
            this.valorDiaria = valorDiaria;
        } else {
            System.out.println("Erro: O valor da diária deve ser maior que zero!");
        }
    }

    public double calcularValorHospedagem() {
        return this.dias * this.valorDiaria;
    }

    public void alterarQuantidadeDias(int novosDias) {
        if (novosDias > 0) {
            this.dias = novosDias;
            System.out.println("Quantidade de dias alterada com sucesso!");
        } else {
            System.out.println("Erro: A quantidade de dias deve ser maior que zero!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("=== Informações da Reserva ===");
        System.out.println("Hóspede: " + hospede);
        System.out.println("Quarto: " + quarto);
        System.out.println("Dias: " + dias);
        System.out.printf("Valor da Diária: R$ %.2f%n", valorDiaria);
        System.out.printf("Valor Total da Hospedagem: R$ %.2f%n", calcularValorHospedagem());
    }
}