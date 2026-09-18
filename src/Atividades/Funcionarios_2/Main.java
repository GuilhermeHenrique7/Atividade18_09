package Atividades.Funcionarios_2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Guilherme Henrique", "Desenvolvedor", 5000.00, 160);

        funcionario.exibirInformacoes();

        System.out.println();

        funcionario.registrarHorasExtras(20);

        System.out.println();

        funcionario.exibirInformacoes();

        System.out.println("\n--- Testando Validações ---");
        funcionario.setSalario(1000.00);
        funcionario.setHorasTrabalhadas(250);
    }
}