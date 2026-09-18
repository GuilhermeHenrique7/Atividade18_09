package Atividades.Senai_10;

public class Main {
    public static void main(String[] args) {
        Equipamento eq = new Equipamento("SENAI-1234", "Computador I7 16GB", "Lab 02");

        eq.exibirInformacoes();

        System.out.println();

        eq.emprestarEquipamento();
        eq.exibirInformacoes();

        System.out.println();

        eq.enviarParaManutencao();
        eq.exibirInformacoes();

        System.out.println();

        eq.liberarEquipamento();
        eq.exibirInformacoes();

        System.out.println("\n--- Testando Validações ---");
        eq.setPatrimonio("");
        eq.setStatus("Inativo");
    }
}