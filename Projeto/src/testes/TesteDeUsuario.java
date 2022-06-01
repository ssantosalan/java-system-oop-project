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
public class TesteDeUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        
//        usuario.setNome_usuario("Joao Andrade");
//        usuario.setEmail("joao-andrade@novablues.com.br");
//        usuario.setSenha("teste");
//        usuario.setAcesso("Colaborador");
//        usuario.setId_usuario(5);
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        //usuarioDAO.cadastrarUser(usuario);
        
        usuarioDAO.excluirUsuario(usuario);
    }
}
