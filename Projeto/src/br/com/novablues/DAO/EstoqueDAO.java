/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.novablues.DAO;

import br.com.novablues.connection.ConnectionFactory;
import br.com.novablues.model.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Gui
 */
public class EstoqueDAO {

    public void cadastrarProduto(Estoque produto) {
        String sql = "INSERT INTO estoque(id_produto, nome_produto, quantidade, valor_unit) VALUES (?, ?, ?, ?)";
        Connection conn = null;

        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, produto.getId_produto());
            pstm.setString(2, produto.getNome_produto());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getValor_unit());

            pstm.execute();
            System.out.println("Produto cadastrado com sucesso!");

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

    public void excluirProduto(Estoque estoque) {
        String sql = "DELETE FROM estoque WHERE id_produto = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, estoque.getId_produto());
            

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
