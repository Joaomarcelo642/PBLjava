package vendaingressos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String login;
    private String senha;
    private String nome;
    private String cpf;
    private String email;
    private Boolean admin;

    // Criar construtores
    public Usuario(String login, String senha, String nome, String cpf, String email, Boolean admin) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.admin = admin;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    //Metodos para testes
   public Boolean isAdmin() {
        return admin;
   }

   public Boolean login(String login, String senha) {
        if(login.equals(this.login) && this.senha.equals(senha)) {
            return true;
        }else return false;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(login, usuario.login) && Objects.equals(nome, usuario.nome) && Objects.equals(cpf, usuario.cpf) && Objects.equals(email, usuario.email) && Objects.equals(admin, usuario.admin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, nome, cpf, email, admin);
    }
}