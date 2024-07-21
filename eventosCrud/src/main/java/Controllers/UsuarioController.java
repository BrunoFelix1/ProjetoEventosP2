package Controllers;

import Interfaces.iUsuario;
import Models.*;
import Persistence.PersistenceUsuario;

import java.util.List;

public class UsuarioController implements iUsuario {
    private PersistenceUsuario _persistenceUsuario;

    public UsuarioController(){
        this._persistenceUsuario = new PersistenceUsuario();
    }

    @Override
    public boolean Logar(String login, String senha) {
        return false;
    }

    @Override
    public void Cadastrar(Usuario usuario) {

    }

    @Override
    public List<Evento> ListarEventosDisponiveis() {
        return List.of();
    }

    @Override
    public void ParticiparDeEvento(Usuario usuario, Evento evento) {

    }

    @Override
    public void ParticiparDeSubEvento(Usuario usuario, SubEvento subevento) {

    }

    @Override
    public void ParticiparDeTrilha(Usuario usuario, Trilha trilha) {

    }

    @Override
    public List<Inscricao> ListarInscricoes(Usuario usuario) {
        return List.of();
    }

    @Override
    public boolean CancelarInscricaoTrilha(Usuario usuario, Trilha trilha) {
        return false;
    }

    @Override
    public Certificado EmitirCertificadoTrilha(Usuario usuario, Trilha trilha) {
        return null;
    }
}