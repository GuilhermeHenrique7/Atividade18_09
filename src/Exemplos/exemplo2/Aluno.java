package Exemplos.exemplo2;

class Aluno {
    // Atributos privados
    private String nome;
    private int idade;
    private double notaFinal;
    // Construtor
    public Aluno(String nome, int idade, double notaFinal) {
        this.nome = nome;
        setIdade(idade); // Usa o setter para aplicar as regras de validação
        setNotaFinal(notaFinal); // Usa o setter para aplicar as regras de validação
    }
    // --- GETTERS E SETTERS ---
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    // Validação: Idade deve ser um valor plausível
    public void setIdade(int idade) {
        if (idade >= 14 && idade <= 100) {
            this.idade = idade;
        } else {
            System.out.println("Erro: Idade inválida para o aluno " + this.nome + " (" + idade + " anos).");
        }
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    // Validação: Nota entre 0.0 e 10.0
    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0.0 && notaFinal <= 10.0) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
        }
    }
    // Método para exibir dados do aluno
    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome + " | Idade: " + idade + " | Nota: " + notaFinal);
    }
}
