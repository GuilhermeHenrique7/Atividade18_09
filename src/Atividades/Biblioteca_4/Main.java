package Atividades.Biblioteca_4;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 2);

        livro.exibirInformacoes();

        System.out.println();

        livro.consultarDisponibilidade();
        livro.emprestarLivro();
        livro.emprestarLivro();
        livro.emprestarLivro();

        System.out.println();

        livro.consultarDisponibilidade();
        livro.devolverLivro();

        System.out.println();

        livro.exibirInformacoes();

        System.out.println("\n--- Testando Validações ---");
        livro.setQuantidade(-3);
    }
}