package Exemplos.exemplo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE DE ENCAPSULAMENTO ===\n");
        // Criando uma conta com saldo inicial de R$ 500.00
        ContaBancaria conta = new ContaBancaria("Guilherme Henrique", 700.0);
        // Tentativa de alterar o saldo DIRETAMENTE (Isso gera erro de compilação!):
        // conta.saldo = 10000.0; // ERRO! saldo é private.
        // Lendo informações via Getters
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo Inicial: R$ " + conta.getSaldo());
        System.out.println("-----------------------------------");
        // Testando operações seguras
        conta.depositar(200.0); // Novo saldo: 700.0
        conta.sacar(150.0); // Novo saldo: 550.0
        // Testando tentativa de operação INVÁLIDA (Regra de validação barra a ação)
        System.out.println("\n--- Tentando realizar operações inválidas ---");
        conta.sacar(1000.0); // Deve exibir erro de saldo insuficiente
        conta.depositar(-50.0); // Deve exibir erro de depósito inválido
        System.out.println("-----------------------------------");
        System.out.println("Saldo Final Confirmado: R$ " + conta.getSaldo());
    }
}