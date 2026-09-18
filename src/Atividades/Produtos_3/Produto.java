package Atividades.Produtos_3;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int estoque;

    public Produto(String nome, String categoria, double preco, int estoque) {
        setNome(nome);
        setCategoria(categoria);
        setPreco(preco);
        setEstoque(estoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço deve ser maior que zero!");
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            System.out.println("Erro: O estoque não pode ser negativo!");
        }
    }

    public void entradaEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.println("Entrada de " + quantidade + " unidades realizada com sucesso!");
        } else {
            System.out.println("Erro: A quantidade de entrada deve ser maior que zero!");
        }
    }

    public void saidaEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            System.out.println("Saída de " + quantidade + " unidades realizada com sucesso!");
        } else {
            System.out.println("Erro: Quantidade inválida ou estoque insuficiente!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("=== Informações do Produto ===");
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Estoque: " + estoque + " unidades");
    }
}