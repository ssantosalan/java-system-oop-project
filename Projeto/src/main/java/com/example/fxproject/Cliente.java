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
            conexao = getConnection("jdbc:mysql://localhost:3306/projetointegrador", "root", "");
            st = (Statement) conexao.createStatement();
            con = getConnection("jdbc:mysql://localhost:3306/projetointegrador", "root", "");
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
    private TextField textoCodigoVendedor;

    @FXML
    private TextField textoEmailCliente;

    @FXML
    private Button botaoAdicionarCliente;


    @FXML
    public void cadastrarCliente(ActionEvent event) throws IOException {
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
