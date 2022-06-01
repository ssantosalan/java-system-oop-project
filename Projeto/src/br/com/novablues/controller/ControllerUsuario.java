package br.com.novablues.controller;

import br.com.novablues.DAO.UsuarioDAO;
import br.com.novablues.model.Usuario;

public class ControllerUsuario {
    //Controller usuário

    private UsuarioDAO UsuarioDAO = new UsuarioDAO();

    public void cadastroUsuarioController(Usuario usuario) {
        this.UsuarioDAO.cadastrarUsuario(usuario);
    }
    
}
