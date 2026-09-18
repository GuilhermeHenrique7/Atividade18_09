package Atividades.Veículo_1;

public class Main {
    public static void main(String[] args) {
        Veiculo meuCarro = new Veiculo("ABC-1234", "Civic", 2020, 0);

        meuCarro.exibirInformacoes();

        System.out.println();

        meuCarro.registrarViagem(150.0);

        System.out.println();

        meuCarro.exibirInformacoes();

        System.out.println("\n--- Testando Validações ---");
        meuCarro.setAno(1980);
        meuCarro.setQuilometragem(-67);
        meuCarro.setPlaca("");
    }
}