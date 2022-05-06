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

public class Produto {

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
    void botaoAdicionarProduto(ActionEvent event) {

    }

    @FXML
    void botaoExcluirProduto(ActionEvent event) {

    }

    @FXML
    void botaoPesquisarProduto(ActionEvent event) {

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
