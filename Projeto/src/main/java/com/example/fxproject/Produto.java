package com.example.fxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class Produto {

    public Connection con;
    public Statement st;
    public ResultSet resultado = null;
    public ResultSet resultado2 = null;

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Produto() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetointegrador", "root", "");
            st = (Statement) conexao.createStatement();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetointegrador", "root", "");
            st = (Statement) con.createStatement();
//            JOptionPane.showMessageDialog(null, "Conectado!");
            System.out.println("Conectado no PRODUTO!");
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Não Conectado!");
            System.out.println("NÃO Conectado no PRODUTO!");
        }
    }

    private void initComponents() {
    }

    @FXML
    private TextField textoCodigoProduto;

    @FXML
    private TextField textoDescricaoProduto;

    @FXML
    private TextField textoPrecoProduto;

    @FXML
    private TextField textoEstoqueProduto;

    @FXML
    private Button botaoAdicionarProduto;

    @FXML
    private TextField textoExcluirCodigoProduto;

    @FXML
    private TextField textoExcluirDescricaoProduto;

    @FXML
    private Button botaoExcluirProduto;

    @FXML
    private TableColumn<?, ?> tabelaRelatorioAnalitico;

    @FXML
    private TextField textoFiltrarCodigoProduto;

    @FXML
    private TextField textoFiltrarDescricaoProduto;

    @FXML
    private Button botaoPesquisarProduto;


    @FXML
    void botaoExcluirProduto(ActionEvent event) {

    }

    @FXML
    void botaoPesquisarProduto(ActionEvent event) {

    }

    public void botaoAdicionarProduto(ActionEvent event) throws IOException {
        String nome;
        int codigo, estoqueAtual;
        double preco;

        try {

            if (textoCodigoProduto.getText().equals("") && !textoDescricaoProduto.getText().equals("") && !textoPrecoProduto.getText().equals("") && !textoEstoqueProduto.getText().equals("")) {

                estoqueAtual = Integer.parseInt(textoEstoqueProduto.getText());
                preco = Double.parseDouble(textoPrecoProduto.getText());
                nome = textoDescricaoProduto.getText();

                String minhasql = "insert into estoque (nome_produto, quantidade, valor_unit) values ('"
                        + nome + "'," + estoqueAtual + "," + preco + ");";
                st.executeUpdate(minhasql);
                System.out.println("Registrado");
//                JOptionPane.showMessageDialog(null, "Produto registrado!");

            } else if (!textoCodigoProduto.getText().equals("") && !textoDescricaoProduto.getText().equals("") && !textoPrecoProduto.getText().equals("") && !textoEstoqueProduto.getText().equals("")) {

                codigo = Integer.parseInt(textoCodigoProduto.getText());
                estoqueAtual = Integer.parseInt(textoEstoqueProduto.getText());
                preco = Double.parseDouble(textoPrecoProduto.getText());
                nome = textoDescricaoProduto.getText();

                String minhasql = "insert into estoque (id_produto, nome_produto, quantidade, valor_unit) values ('"
                        + codigo + "','" + nome + "','" + estoqueAtual + "','" + preco + "')";
                st.executeUpdate(minhasql);
//                JOptionPane.showMessageDialog(null, "Produto registrado!");
                System.out.println("Não Registrado");

            } else {
                System.out.println("Espaço obrigatório em branco!");
//                JOptionPane.showMessageDialog(null, "Espaço obrigatório em branco!");
            }

        } catch (Exception e) {
            System.out.println("Não gravado!");
//            JOptionPane.showMessageDialog(null, "Não gravado!");
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
