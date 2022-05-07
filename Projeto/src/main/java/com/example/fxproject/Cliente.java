package com.example.fxproject;

import com.example.fxproject.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

import static java.sql.DriverManager.*;

public class Cliente {
    public Connection con;
    public Statement st;
    public ResultSet resultado = null;
    public ResultSet resultado2 = null;

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Cliente() {

        this.setLocationRelativeTo(null);
        try {
            conexao = getConnection("jdbc:mysql://localhost:3306/projetointegrador_terceiro", "root", "");
            st = (Statement) conexao.createStatement();
            con = getConnection("jdbc:mysql://localhost:3306/projetointegrador_terceiro", "root", "");
            st = (Statement) con.createStatement();
//            JOptionPane.showMessageDialog(null, "Conectado!");
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Não Conectado!");
        }
    }

    @FXML
    private TextField textoCodigoCliente;

    @FXML
    private TextField textoNomeCliente;

    @FXML
    private TextField textoCPFCliente;

    @FXML
    private TextField textoTelefoneCliente;

    @FXML
    private TextField textoExcluirCPFCliente;

    @FXML
    private TextField textoExcluirCodigoCliente;

    @FXML
    private TextField textoExcluirNomeCliente;

    @FXML
    private TextField textoEmailCliente;


    @FXML
    public void botaoExcluirCliente(ActionEvent event) throws IOException {
        String minhaSQL = "delete from cliente where id_cliente=" + textoExcluirCodigoCliente.getText();
        try {

            if (!textoExcluirCodigoCliente.getText().equals("") && !textoExcluirCPFCliente.getText().equals("") && !textoExcluirNomeCliente.getText().equals("")) {
                String sql = "select * from cliente where id_cliente=? and nome=? and CPF=?";
                pst = con.prepareStatement(sql);
                pst.setString(1, textoExcluirCodigoCliente.getText());
                pst.setString(2, textoExcluirNomeCliente.getText());
                pst.setString(3, textoExcluirCPFCliente.getText());
                resultado = pst.executeQuery();

                if (resultado.next()) {
                    String codigo = resultado.getString(1);
                    String nome = resultado.getString(2);
                    String CPF = resultado.getString(3);

                    if (codigo.equals(textoExcluirCodigoCliente.getText()) && nome.equals(textoExcluirNomeCliente.getText()) && CPF.equals(textoExcluirCPFCliente.getText())) {
                        st.executeUpdate(minhaSQL);
                        System.out.println("Cliente excluído com sucesso!");
                        //JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
                    }
                } else {
                    System.out.println("Informações incompatíveis!");
                   // JOptionPane.showMessageDialog(null, "Informações incompatíveis!");
                }

            } else {
                System.out.println("Espaço obrigatório em branco!");
               // JOptionPane.showMessageDialog(null, "Espaço obrigatório em branco!");
            }

        } catch (Exception e) {

        }
    }

    @FXML
    public void botaoAdicionarCliente(ActionEvent event) throws IOException {
        String codigo = textoCodigoCliente.getText();
        String nome = textoNomeCliente.getText();
        String cpf = textoCPFCliente.getText();
        String email = textoEmailCliente.getText();
        String telefone = textoTelefoneCliente.getText();

        try {

            if (codigo.equals("") && !nome.equals("") && !cpf.equals("")) {
                String minhaSQL = "insert into cliente(nome,cpf,telefone,email) values('" + nome + "','" + cpf + "','" + telefone + "','" + email + "');";
//                JOptionPane.showMessageDialog(null, "Registro gravado");
                System.out.println("Gravou");
                st.executeUpdate(minhaSQL);
            } else if (!codigo.equals("") && !nome.equals("") && !cpf.equals("")) {
                String minhaSQL = "insert into cliente(id_cliente,nome,cpf,telefone,email) values('" + codigo + "','" + nome + "','" + cpf + "','" + telefone + "','" + email + "');";
//                JOptionPane.showMessageDialog(null, "Registro gravado com id");
                st.executeUpdate(minhaSQL);
            } else {
//                JOptionPane.showMessageDialog(null, "Espaço obrigatório em branco!");
            }

        } catch (Exception e) {
            //Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "Não foi possivel gravar as informações do cliente");
        }
    }

    private void setLocationRelativeTo(Object o) {
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void trocarParaTelaMain(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void trocarParaTelaCliente(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tela-cadastro-cliente.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void trocarParaTelaVendedor(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tela-cadastro-vendedor.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void trocarParaTelaProduto(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tela-cadastro-produto.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void trocarParaTelaRelatorioAnalitico(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tela-relatorio-analitico.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void trocarParaTelaRelatorioSintetico(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tela-relatorio-sintetico.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void trocarParaTelaVenda(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tela-venda.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
