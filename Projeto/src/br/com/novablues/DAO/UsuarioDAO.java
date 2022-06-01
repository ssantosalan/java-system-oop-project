package br.com.novablues.DAO;

import br.com.novablues.connection.ConnectionFactory;
import br.com.novablues.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario) {
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
            System.out.println("Usuário cadastrado com sucesso!");

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

    public void excluirUsuario(Usuario usuario) {
        String sql = "DELETE FROM usuario WHERE id_usuario = ? and nome_usuario=?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, usuario.getId_usuario());
            pstm.setString(2, usuario.getNome_usuario());

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

    public boolean procurarUsuarioPorNomeOuId(String nome, String id) {
        ArrayList<Usuario> usuarioList = new ArrayList();
        String sql = "select * from usuario where id_usuario=? and nome_usuario=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        Usuario usuario = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, id);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                usuario = new Usuario(rs.getString("id_usuario"), rs.getString("nome_usuario"));
//                usuario.setId_usuario(rs.getString("id_usuario"));
                usuarioList.add(usuario);
            }

            System.out.println("PESQUISADO POR NOME ou CPF COM SUCESSO!");

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
        return true;
    }

    public Usuario SeUsuarioNomeOuIdEIgual(String nome, String id) {
        ArrayList<Usuario> usuarioList = new ArrayList();
        String sql = "select * from usuario where id_usuario=? and nome_usuario=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        Usuario usuario = null;

        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, id);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                usuario = new Usuario(rs.getString("id_usuario"), rs.getString("nome_usuario"));
//                usuario.setId_usuario(rs.getString("id_usuario"));
                usuarioList.add(usuario);
            }

            System.out.println("PESQUISADO POR NOME ou CPF COM SUCESSO!");

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
        return usuario;
    }


    public void login(String email, String senha) {
        String sql = "select * from usuario where email=? and senha=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        Usuario usuario = new Usuario();
        try {
            conn = ConnectionFactory.createConnectionToMySql();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, email);
            pstm.setString(2, senha);

        } catch (Exception e) {

        }

    }

}
