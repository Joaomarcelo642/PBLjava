public class Usuario {
    private String login;
    private String senha;
    private String cpf;
    private String email;

    // Criar construtores
    public Usuario(String login, String senha, String cpf, String email) {
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
        this.email = email;
    }

    //Criar metodos GET e SET

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodos para testes
    public void adicionarIngresso(){

    }

    public void cancelarIngresso(){

    }

    //Metodo para representar usuario
    public void exibirInformacoes() {
        System.out.println("LOGIN: " + login);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }

    public String toString() {
        return "UserPBL{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", CPF=" + cpf +
                '}';
    }
}
