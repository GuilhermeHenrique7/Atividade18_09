package Atividades.Hotel_7;

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new Reserva("Guilherme Henrique", 104, 5, 150.00);

        reserva.exibirInformacoes();

        System.out.println();

        reserva.alterarQuantidadeDias(7);

        System.out.println();

        reserva.exibirInformacoes();

        System.out.println("\n--- Testando Validações ---");
        reserva.setDias(0);
        reserva.setValorDiaria(-50.0);
        reserva.alterarQuantidadeDias(-2);
    }
}