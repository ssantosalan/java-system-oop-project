/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.novablues.DAO;

import br.com.novablues.connection.ConnectionFactory;
import br.com.novablues.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Gui
 */
public class ClienteDAO {
    
    public void cadastrarCliente(Cliente cliente){
        String sql = "INSERT INTO cliente(nome, CPF, telefone, email) VALUES (?, ?, ?, ?)";
		Connection conn = null;

		PreparedStatement pstm = null;
                
                
		try {
			conn = ConnectionFactory.createConnectionToMySql();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, cliente.getNome() );
			pstm.setString(2, cliente.getCPF());
			pstm.setString(3, cliente.getTelefone());
                        pstm.setString(4, cliente.getEmail());

			pstm.execute();
			System.out.println("Cliente cadastrado com sucesso!");

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
    public void excluirCliente(Cliente cliente) {
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, cliente.getId());
            

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
