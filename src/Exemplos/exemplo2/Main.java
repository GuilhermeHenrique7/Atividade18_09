package Exemplos.exemplo2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ENCAPSULAMENTO - CADASTRO DE ALUNO ===\n");
        // Criando aluno com dados válidos
        Aluno aluno1 = new Aluno("Mariana", 18, 9.5);
        aluno1.exibirInformacoes();
        System.out.println("\n--- Testando alterações e validações via Setters ---");

        // Alterando para valores inválidos
        aluno1.setIdade(-5); // Exibe erro
        aluno1.setNotaFinal(15.0); // Exibe erro
        // Como a validação bloqueou, os dados antigos se mantêm protegidos
        System.out.println("\n--- Estado do Aluno Após Tentativas Inválidas ---");
        aluno1.exibirInformacoes();
    }
}