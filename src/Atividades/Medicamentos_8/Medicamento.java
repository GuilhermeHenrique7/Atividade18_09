package Atividades.Medicamentos_8;

import java.time.LocalDate;

public class Medicamento {
    private String nome;
    private String fabricante;
    private int quantidade;
    private LocalDate validade;

    public Medicamento(String nome, String fabricante, int quantidade, LocalDate validade) {
        setNome(nome);
        setFabricante(fabricante);
        setQuantidade(quantidade);
        setValidade(validade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Erro: A quantidade não pode ser negativa!");
        }
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        if (validade != null && !validade.isBefore(LocalDate.now())) {
            this.validade = validade;
        } else {
            System.out.println("Erro: A data de validade não pode ser anterior à data atual!");
        }
    }

    public void entradaMedicamentos(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
            System.out.println("Entrada de " + qtd + " unidades realizada com sucesso!");
        } else {
            System.out.println("Erro: A quantidade de entrada deve ser maior que zero!");
        }
    }

    public void baixaMedicamentos(int qtd) {
        if (qtd > 0 && qtd <= this.quantidade) {
            this.quantidade -= qtd;
            System.out.println("Baixa de " + qtd + " unidades realizada com sucesso!");
        } else {
            System.out.println("Erro: Quantidade inválida ou estoque insuficiente!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("=== Informações do Medicamento ===");
        System.out.println("Nome: " + nome);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Validade: " + validade);
    }
}