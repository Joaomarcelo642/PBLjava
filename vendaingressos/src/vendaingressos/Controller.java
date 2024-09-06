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


    public void listarEventosDisponiveis() {
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }

    public void comprarIngresso(Evento evento) {

    }


    public void cancelarCompraIngresso() {

    }
}
