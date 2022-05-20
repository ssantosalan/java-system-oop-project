/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.novablues.model;

/**
 *
 * @author Gui
 */
public class Estoque {

    private int id_produto;
    private String nome_produto;
    private int quantidade;
    private double valor_unit;

    public Estoque(int id_produto, String nome_produto, int quantidade, double valor_unit) {
        this.id_produto = id_produto;
        this.nome_produto = nome_produto;
        this.quantidade = quantidade;
        this.valor_unit = valor_unit;
    }

    public Estoque() {
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_unit() {
        return valor_unit;
    }

    public void setValor_unit(double valor_unit) {
        this.valor_unit = valor_unit;
    }

}
