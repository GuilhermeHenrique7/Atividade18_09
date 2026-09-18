package Atividades.Medicamentos_8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Medicamento med = new Medicamento("Paracetamol", "Nosei", 50, LocalDate.of(2027, 12, 31));

        med.exibirInformacoes();

        System.out.println();

        med.entradaMedicamentos(20);
        med.baixaMedicamentos(15);

        System.out.println();

        med.exibirInformacoes();

        System.out.println("\n--- Testando Validações ---");
        med.setQuantidade(-10);
        med.setValidade(LocalDate.of(2020, 1, 1));
        med.baixaMedicamentos(100);
    }
}