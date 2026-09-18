package Exemplos.exemplo;

class ContaBancaria {
    // 1. Atributos PRIVADOS (Protegidos contra alteração direta externa)
    private String titular;
    private double saldo;
    // 2. Método Construtor: Inicializa o objeto com validação inicial
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        // Garante que a conta não comece com saldo negativo
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Aviso: Saldo inicial inválido. Defenido como R$ 0,00.");
        }
    }
    // 3. GETTERS (Apenas Leitura)
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    // 4. SETTER com Validação (Alterar Nome do Titular)
    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Erro: Nome do titular não pode ser vazio.");
        }
    }
    // 5. Métodos com Regras de Negócio que controlam a alteração do saldo
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor de saque inválido.");
        }
    }
}

