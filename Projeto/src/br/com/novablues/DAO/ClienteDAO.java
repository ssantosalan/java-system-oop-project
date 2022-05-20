/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.novablues.DAO;

import br.com.novablues.connection.ConnectionFactory;
import br.com.novablues.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public void cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente(nome, CPF, telefone, email) VALUES (?, ?, ?, ?)";
        Connection conn = null;

        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, cliente.getNome());
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

    public Cliente procurarPorId(int id) {
        String sql = "select * from cliente where id_cliente like ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        Cliente cliente = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                cliente = new Cliente(rs.getInt("id_cliente"), rs.getString("nome"), rs.getString("CPF"), rs.getString("telefone"), rs.getString("email"));
            }

            System.out.println("PESQUISADO POR ID COM SUCESSO!");

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
        return cliente;
    }
    
    public List<Cliente> procurarPorNome(String nome) {
        ArrayList<Cliente> clienteList = new ArrayList();
        String sql = "select * from cliente where nome like ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        Cliente cliente = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + nome + "%");
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                cliente = new Cliente(rs.getInt("id_cliente"), rs.getString("nome"), rs.getString("CPF"), rs.getString("telefone"), rs.getString("email"));
                cliente.setId(rs.getInt("id_cliente"));
                clienteList.add(cliente);
            }

            System.out.println("PESQUISADO POR NOME COM SUCESSO!");

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
        return clienteList;
    }
    
    public List<Cliente> procurarPorCPF(String CPF) {
        ArrayList<Cliente> clienteList = new ArrayList();
        String sql = "select * from cliente where CPF like ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        Cliente cliente = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + CPF + "%");
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                cliente = new Cliente(rs.getInt("id_cliente"), rs.getString("nome"), rs.getString("CPF"), rs.getString("telefone"), rs.getString("email"));
                cliente.setId(rs.getInt("id_cliente"));
                clienteList.add(cliente);
            }

            System.out.println("PESQUISADO POR CPF COM SUCESSO!");

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
        return clienteList;
    }
    
    public List<Cliente> procurarPorNomeOuIdOuCPF(String nome, String Id, String CPF) {
        ArrayList<Cliente> clienteList = new ArrayList();
        String sql = "select * from cliente where nome like ? or id_cliente like ? or CPF like ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        Cliente cliente = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, Id);
            pstm.setString(3, CPF);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                cliente = new Cliente(rs.getInt("id_cliente"), rs.getString("nome"), rs.getString("CPF"), rs.getString("telefone"), rs.getString("email"));
                cliente.setId(rs.getInt("id_cliente"));
                clienteList.add(cliente);
            }

            System.out.println("PESQUISADO POR NOME COM SUCESSO!");

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
        return clienteList;
    }

}
