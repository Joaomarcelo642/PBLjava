import java.util.Date;

public class Evento {
    private String nome;
    private String descricao;
    private Date data;

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

    //Metodos de teste
    public void venderIngresso(){

    }

    public void eventoAtivo(){

    }
}
