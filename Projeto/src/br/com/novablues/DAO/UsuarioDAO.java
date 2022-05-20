/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.novablues.DAO;

import br.com.novablues.connection.ConnectionFactory;
import br.com.novablues.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Gui
 */
public class UsuarioDAO {
     public void cadastrarUser (Usuario usuario){
        String sql = "INSERT INTO usuario(nome_usuario, email, senha, acesso) VALUES (?, ?, ?, ?)";
		Connection conn = null;

		PreparedStatement pstm = null;
                
                
		try {
			conn = ConnectionFactory.createConnectionToMySql();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, usuario.getNome_usuario());
			pstm.setString(2, usuario.getEmail());
			pstm.setString(3, usuario.getSenha());
                        pstm.setString(4, usuario.getAcesso());

			pstm.execute();
			System.out.println("Usuario cadastrado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fechar conexoes
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
     
     public void excluirUser(Usuario usuario) {
        String sql = "DELETE FROM usuario WHERE id_usuario = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, usuario.getId_usuario());
            

            pstm.execute();
            System.out.println("EXCLUÍDO COM SUCESSO!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}