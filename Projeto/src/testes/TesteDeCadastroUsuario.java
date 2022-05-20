/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import br.com.novablues.DAO.UsuarioDAO;
import br.com.novablues.model.Usuario;

/**
 *
 * @author Gui
 */
public class TesteDeCadastroUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        
        usuario.setNome_usuario("Arthur Solla");
        usuario.setEmail("arthur-sollaa@novablues.com.br");
        usuario.setSenha("romulo");
        usuario.setAcesso("Gerente");
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        usuarioDAO.cadastrarUser(usuario);
        
    }
}
