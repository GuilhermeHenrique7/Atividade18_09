package Atividades.Funcionarios_2;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int horasTrabalhadas;

    public Funcionario(String nome, String cargo, double salario, int horasTrabalhadas) {
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
        setHorasTrabalhadas(horasTrabalhadas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 1518.00) {
            this.salario = salario;
        } else {
            System.out.println("Erro: O salário deve ser maior que R$ 1.518,00!");
        }
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas >= 0 && horasTrabalhadas <= 220) {
            this.horasTrabalhadas = horasTrabalhadas;
        } else {
            System.out.println("Erro: As horas trabalhadas devem estar entre 0 e 220!");
        }
    }

    public void registrarHorasExtras(int horas) {
        if (horas > 0) {
            this.horasTrabalhadas += horas;
            System.out.println("Horas extras registradas com sucesso!");
        } else {
            System.out.println("Erro: A quantidade de horas extras deve ser maior que zero!");
        }
    }

    public double calcularSalarioComHorasExtras() {
        double valorHora = this.salario / 220;
        double valorHorasExtras = 0;

        if (this.horasTrabalhadas > 160) {
            int horasExtras = this.horasTrabalhadas - 160;
            valorHorasExtras = horasExtras * (valorHora * 1.5);
        }

        return this.salario + valorHorasExtras;
    }

    public void exibirInformacoes() {
        System.out.println("=== Informações do Funcionário ===");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário Base: R$ %.2f%n", salario);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.printf("Salário Total: R$ %.2f%n", calcularSalarioComHorasExtras());
    }
}