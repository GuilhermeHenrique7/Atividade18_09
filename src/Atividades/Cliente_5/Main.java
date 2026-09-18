package Atividades.Cliente_5;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Guilherme Henrique", "12345678901", "gui@email.com", "(11) 40028-9223");

        cliente.exibirInformacoes();

        System.out.println();

        cliente.atualizarTelefone("(11) 12345-6789");
        cliente.atualizarEmail("gui.pulaebota@email.com");

        System.out.println();

        cliente.exibirInformacoes();

        System.out.println("\n--- Testando Validações ---");
        cliente.setNome("");
        cliente.setCpf("12345");
        cliente.atualizarEmail("emailsemarrobagmail.com");
    }
}
