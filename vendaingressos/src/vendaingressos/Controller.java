package vendaingressos;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Controller {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Evento> eventos = new ArrayList<>();


    //Metodos teste
    public Usuario cadastrarUsuario(String login, String senha, String nome, String cpf, String email, Boolean admin) {
        Usuario usuario = new Usuario(login, senha, nome, cpf, email, admin);
        usuarios.add(usuario);
        return usuario;
    }


    public Evento cadastrarEvento(Usuario usuario, String nome, String descricao, Date data) {
        if(usuario.getAdmin()){
            Evento evento = new Evento(nome, descricao, data);
            eventos.add(evento);
            return evento;
        }else {
            throw new SecurityException("Somente administradores podem cadastrar eventos.");
        }
    }

    
    public void adicionarAssentoEvento(String nomeEvento, String assento){
        for(Evento evento : eventos){
            if(evento.getNome().equals(nomeEvento)){
                evento.adicionarAssento(assento);
                return;
            }
        }
    }

    public Ingresso comprarIngresso(Usuario usuario, String nomeEvento, String assento){
        for(Evento evento : eventos){
            if(evento.getNome().equals(nomeEvento) && evento.isAtivo()){
                if(evento.getAssentosDisponiveis().contains(assento)){
                    Ingresso ingresso = new Ingresso(evento, 1, assento);
                    usuario.getIngressos().add(ingresso);
                    return ingresso;
                }else return null;
            }else return null;
        }return null;
    }

    public Boolean cancelarCompra(Usuario usuario, Ingresso ingresso){
        for(Usuario usuario1 : usuarios){
            if(usuario1.equals(usuario)){
                if(usuario.getIngressos().contains(ingresso)){
                    boolean cancelado = ingresso.cancelar();
                    if(cancelado) {
                        usuario.getIngressos().remove(ingresso);
                        ingresso.getEvento().adicionarAssento(ingresso.getAssento());
                        return cancelado;
                    }
                }else return false;
            }else return false;
        }return null;
    }

    public List<Evento> listarEventosDisponiveis() {
        return eventos;
    }

    public List<Ingresso> listarIngressosComprados(Usuario usuario) {
        return usuario.getIngressos();
    }
}
