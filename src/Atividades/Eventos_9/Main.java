package Atividades.Eventos_9;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento("Festival de Música", 100, 150.00);

        evento.exibirInformacoes();

        System.out.println();

        evento.venderIngresso(80);
        System.out.println("Vagas atuais: " + evento.mostrarVagasDisponiveis());

        System.out.println();

        evento.cancelarIngresso(10);

        System.out.println();

        evento.exibirInformacoes();

        System.out.println("\n--- Testando Validações ---");
        evento.setCapacidade(0);
        evento.venderIngresso(50);
        evento.cancelarIngresso(100);
    }
}