package vendaingressos;

public class Ingresso {
    private Evento evento;
    private double preco;
    private String assento

    //Construtor
    public Ingresso(Evento evento, double preco, String assento) {
        this.evento = evento;
        this.preco = preco;
        this.assento = assento;
    }

    //Sets e Gets
    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAssento() {
        return assento;
    }
    public void setAssento(String assento) {
        this.assento = assento;
    }

    //Metodos para testes
    public Boolean isAtivo(){}
}
