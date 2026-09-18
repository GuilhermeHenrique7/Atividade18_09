package Atividades.Biblioteca_4;

public class Livro {
    private String titulo;
    private String autor;
    private int quantidade;
    private boolean disponivel;

    public Livro(String titulo, String autor, int quantidade) {
        setTitulo(titulo);
        setAutor(autor);
        setQuantidade(quantidade);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
            this.disponivel = this.quantidade > 0;
        } else {
            System.out.println("Erro: A quantidade não pode ser negativa!");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestarLivro() {
        if (this.quantidade > 0) {
            this.quantidade--;
            this.disponivel = this.quantidade > 0;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Erro: Livro indisponível para empréstimo!");
        }
    }

    public void devolverLivro() {
        this.quantidade++;
        this.disponivel = true;
        System.out.println("Livro devolvido com sucesso!");
    }

    public void consultarDisponibilidade() {
        if (disponivel) {
            System.out.println("O livro '" + titulo + "' está DISPONÍVEL (" + quantidade + " cópias).");
        } else {
            System.out.println("O livro '" + titulo + "' está INDISPONÍVEL.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("=== Informações do Livro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
