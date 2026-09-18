package Atividades.Senai_10;

public class Equipamento {
    private String patrimonio;
    private String descricao;
    private String status;
    private String laboratorio;

    public Equipamento(String patrimonio, String descricao, String laboratorio) {
        setPatrimonio(patrimonio);
        setDescricao(descricao);
        setLaboratorio(laboratorio);
        this.status = "Disponível";
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        if (patrimonio != null && !patrimonio.trim().isEmpty()) {
            this.patrimonio = patrimonio;
        } else {
            System.out.println("Erro: O patrimônio é obrigatório!");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("Disponível") || status.equals("Em Uso") || status.equals("Manutenção")) {
            this.status = status;
        } else {
            System.out.println("Erro: Status inválido!");
        }
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void emprestarEquipamento() {
        if (this.status.equals("Disponível")) {
            this.status = "Em Uso";
            System.out.println("Equipamento emprestado com sucesso!");
        } else {
            System.out.println("Erro: Equipamento indisponível para empréstimo!");
        }
    }

    public void enviarParaManutencao() {
        if (!this.status.equals("Manutenção")) {
            this.status = "Manutenção";
            System.out.println("Equipamento enviado para manutenção!");
        } else {
            System.out.println("O equipamento já está em manutenção!");
        }
    }

    public void liberarEquipamento() {
        this.status = "Disponível";
        System.out.println("Equipamento liberado e disponível para uso!");
    }

    public void exibirInformacoes() {
        System.out.println("=== Informações do Equipamento ===");
        System.out.println("Patrimônio: " + patrimonio);
        System.out.println("Descrição: " + descricao);
        System.out.println("Laboratório: " + laboratorio);
        System.out.println("Status: " + status);
    }
}