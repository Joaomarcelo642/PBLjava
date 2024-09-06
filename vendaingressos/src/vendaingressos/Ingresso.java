package vendaingressos;

import java.util.Objects;

public class Ingresso {
    private Evento evento;
    private double preco;
    private String assento;
    private Boolean isAtivo;

    //Construtor
    public Ingresso(Evento evento, double preco, String assento) {
        this.evento = evento;
        this.preco = preco;
        this.assento = assento;
        this.isAtivo = true;
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

    public Boolean getIAtivo() {
        return isAtivo;
    }
    public void setIAtivo(Boolean isAtivo) {
        this.isAtivo = isAtivo;
    }

    //Metodos para testes
    public Boolean isAtivo(){
        return isAtivo;
    }

    public Boolean cancelar(){
        if(isAtivo && evento.isAtivo()){
            isAtivo = false;
            return true;
        }else return false;
    }

    public Boolean reativar(){
        if(!isAtivo && evento.isAtivo()){
            isAtivo = true;
            return true;
        }else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingresso ingresso = (Ingresso) o;
        return Double.compare(preco, ingresso.preco) == 0 && Objects.equals(evento, ingresso.evento) && Objects.equals(assento, ingresso.assento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evento, preco, assento);
    }
}
