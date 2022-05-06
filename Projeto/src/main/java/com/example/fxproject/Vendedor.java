package com.example.fxproject;

import com.example.fxproject.MyDatabaseConnection;
import com.example.fxproject.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;


public class Vendedor {

    public Connection con;
    public Statement st;
    public ResultSet resultado = null;
    public ResultSet resultado2 = null;

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Vendedor() {
//        initComponents();
        this.setLocationRelativeTo(null);
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetointegrador_terceiro", "root", "");
            st = (Statement) conexao.createStatement();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetointegrador_terceiro", "root", "");
            st = (Statement) con.createStatement();
//            JOptionPane.showMessageDialog(null, "Conectado!");
            System.out.println("CONECTOU");
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Não Conectado!");
            System.out.println("NÂO CONECTOU");

        }
    }

    private void setLocationRelativeTo(Object o) {
    }


    @FXML
    private TextField textoNomeVendedor;

    @FXML
    private TextField textoCodigoVendedor;

    @FXML
    private TextField textoEmailVendedor;

    @FXML
    private TextField textoSenhaVendedor;

    @FXML
    private TextField textoConfirmarSenhaVendedor;

    @FXML
    private Button botaoAdicionarVendedor;

//    VendedorController vendedorController = new VendedorController();
//    public Statement st = vendedorController.st;

    @FXML
    public void cadastrarVendedor(ActionEvent event) throws IOException {
//        String codigo, nome, email, senha, confirmarSenha;

        String codigo = textoCodigoVendedor.getText();
        String nome = textoNomeVendedor.getText();
        String email = textoEmailVendedor.getText();
        String senha = textoSenhaVendedor.getText();
        String confirmarSenha = textoConfirmarSenhaVendedor.getText();

//        String acesso = "";
//        if (botaoAcessoGerenteVendedor.isSelected()) {
//            acesso = "Gerente";
//        } else if (botaoAcessoColaboradorVendedor.isSelected()) {
//            acesso = "Colaborador";
//        }
        String acesso = "Gerente";

        try {

            if (codigo.equals("") && !nome.equals("") && !email.equals("") && !senha.equals("") && !confirmarSenha.equals("")) {
                if (senha.equals(confirmarSenha) && confirmarSenha.equals(senha)) {
                    String minhasql = "insert into usuario (nome_usuario, email, senha, acesso) values ('"
                            + nome + "','" + email + "','" + senha + "','" + acesso + "');";
                    st.executeUpdate(minhasql);
                    System.out.println("REGISTRADO");
                    new AlertBox("Usuário registrado!", "Registrado", new Alert(Alert.AlertType.CONFIRMATION));
//                    JOptionPane.showMessageDialog(null, "Registro do usuário gravado!");
                } else {
//                    JOptionPane.showMessageDialog(null, "Senhas incompatíveis!");
                }

            } else if (!codigo.equals("") && !nome.equals("") && !email.equals("") && !senha.equals("") && !confirmarSenha.equals("")) {
                if (senha.equals(confirmarSenha) && confirmarSenha.equals(senha)) {
                    String minhasql = "insert into usuario (id_usuario, nome_usuario, email, senha, acesso) values ('"
                            + codigo + "','" + nome + "','" + email + "','" + senha + "','" + acesso + "')";
                    st.executeUpdate(minhasql);
//                    JOptionPane.showMessageDialog(null, "Registro do usuário gravado!");
                } else {
//                    JOptionPane.showMessageDialog(null, "Senhas incompatíveis!");
                }

            } else {
//                JOptionPane.showMessageDialog(null, "Espaço obrigatório em branco!");
            }

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Não gravado!");
        }
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
