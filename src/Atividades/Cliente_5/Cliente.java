package Atividades.Cliente_5;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Cliente(String nome, String cpf, String email, String telefone) {
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: O nome é obrigatório!");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null) {
            String cpfApenasNumeros = cpf.replaceAll("\\D", "");
            if (cpfApenasNumeros.length() == 11) {
                this.cpf = cpf;
            } else {
                System.out.println("Erro: O CPF deve conter 11 dígitos!");
            }
        } else {
            System.out.println("Erro: O CPF deve conter 11 dígitos!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Erro: O e-mail deve conter '@'!");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void atualizarTelefone(String novoTelefone) {
        setTelefone(novoTelefone);
        System.out.println("Telefone atualizado com sucesso!");
    }

    public void atualizarEmail(String novoEmail) {
        if (novoEmail != null && novoEmail.contains("@")) {
            this.email = novoEmail;
            System.out.println("E-mail atualizado com sucesso!");
        } else {
            System.out.println("Erro ao atualizar: O e-mail deve conter '@'!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("=== Informações do Cliente ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
    }
}