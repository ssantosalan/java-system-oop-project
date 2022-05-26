/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.novablues.DAO;

import br.com.novablues.connection.ConnectionFactory;
import br.com.novablues.model.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<Estoque> ListagemProdutos() {
		String sql = "SELECT * FROM  estoque";

		List<Estoque> produtos = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstm = null;
		// Classe(Interface) que vai recuperar os dados do banco. ****SELECT***
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySql();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				Estoque produto = new Estoque();
				
				produto.setId_produto(rset.getInt("id_produto"));
			
				produto.setNome_produto(rset.getString("nome_produto"));
				
				produto.setQuantidade(rset.getInt("quantidade"));
				
				produto.setValor_unit(rset.getDouble("valor_unit"));

				produtos.add(produto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {

					rset.close();
				}
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
		return produtos;
}
    
    
    public List<Estoque> ListagemForName(String name) {
		String sql = "SELECT * FROM  estoque WHERE nome_produto LIKE ?";
		
		

		List<Estoque> produtos = new ArrayList<Estoque>();

		Connection conn = null;
		PreparedStatement pstm = null;
		// Classe(Interface) que vai recuperar os dados do banco. ****SELECT***
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySql();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%" + name + "%");
			rset = pstm.executeQuery();

			while (rset.next()) {
				Estoque produto = new Estoque();
				
				produto.setId_produto(rset.getInt("id_produto"));
				
				produto.setNome_produto(rset.getString("nome_produto"));
				
				produto.setQuantidade(rset.getInt("quantidade"));
				
				produto.setValor_unit(rset.getDouble("valor_unit"));

				produtos.add(produto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {

					rset.close();
				}
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
		return produtos;
	}
}
