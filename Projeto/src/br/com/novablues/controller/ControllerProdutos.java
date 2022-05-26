/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.novablues.controller;

import br.com.novablues.DAO.EstoqueDAO;
import br.com.novablues.DAO.UsuarioDAO;
import br.com.novablues.model.Estoque;
import java.util.ArrayList;

/**
 *
 * @author Gui
 */
public class ControllerProdutos {
    

    //Controllers de produto
    
    private EstoqueDAO estoqueDAO = new EstoqueDAO();
    
    public ArrayList<Estoque> retornaProdutosBuscadosController (String name){
        return (ArrayList<Estoque>) this.estoqueDAO.ListagemForName(name);
    }
    
    public ArrayList<Estoque>  retornaListaProdutos (){
        return (ArrayList<Estoque>) this.estoqueDAO.ListagemProdutos();
    }
}
