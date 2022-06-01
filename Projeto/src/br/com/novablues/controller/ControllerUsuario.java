package br.com.novablues.controller;

import br.com.novablues.DAO.UsuarioDAO;
import br.com.novablues.model.Usuario;

public class ControllerUsuario {
    //Controller usuário

    private UsuarioDAO UsuarioDAO = new UsuarioDAO();

    public void cadastroUsuarioController(Usuario usuario) {
        this.UsuarioDAO.cadastrarUsuario(usuario);
    }
    
    public void excluirUsuarioController(Usuario usuario) {
        this.UsuarioDAO.excluirUsuario(usuario);
    }
    
    public boolean procurarUsuarioPorNomeOuId(String nome, String id) {
        if(this.UsuarioDAO.procurarUsuarioPorNomeOuId(nome, id)) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
