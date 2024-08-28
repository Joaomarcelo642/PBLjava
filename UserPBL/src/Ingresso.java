public class Ingresso {
    private String id;
    private Evento evento;

    //Construtor
    public Ingresso(String id, Evento evento) {
        this.id = id;
        this.evento = evento;
    }

    //Sets e Gets
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

}
