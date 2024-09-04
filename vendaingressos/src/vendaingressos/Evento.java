package vendaingressos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    private String nome;
    private String descricao;
    private Date data;
    private List<String> assentosdisponiveis = new ArrayList<>();

    //Construtor
    public Evento(String nome, String descricao, Date data) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }

    //Sets e Gets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public List<String> getAssentosDisponiveis() {
        return assentosdisponiveis;
    }
    public void setAssentosDisponiveis(List<String> assentosdisponiveis) {
        this.assentosdisponiveis = assentosdisponiveis;
    }

    //Metodos de teste
    public void adicionarAssento(String assento) {
        assentosdisponiveis.add(assento);
    }

    public void removerAssento(String assento) {
        assentosdisponiveis.remove(assento);
    }

    public Boolean isAtivo() {
        if (data.after(new Date()) || data.equals(new Date()))
            return true;
        else return false;
    }

}
