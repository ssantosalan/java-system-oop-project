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

public class SceneController {
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

    @FXML
    private TextField textoNomeCliente;

    @FXML
    private TextField textoCPFCliente;

    @FXML
    private TextField textoTelefoneCliente;

    @FXML
    private TextField textoCodigoCliente;

    @FXML
    private TextField textoEmailCliente;

    @FXML
    private Button botaoAdicionarCliente;

    @FXML
    void botaoGerarRelatorio2(ActionEvent event) { // DEPOIS RETIRA ISSO. FEITO SOMENTE PARA VISUALIZAR AO CLICAR NO DASHBOARD

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
    private TextField textoEstoqueProduto1;

    @FXML
    private TextField textoEstoqueProduto11;

    @FXML
    private Button botaoAdicionarProduto1;

    @FXML
    void botaoAdicionarProduto(ActionEvent event) {

    }


}
