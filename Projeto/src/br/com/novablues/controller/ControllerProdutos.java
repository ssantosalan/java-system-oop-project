
package br.com.novablues.controller;

import br.com.novablues.DAO.EstoqueDAO;
import br.com.novablues.DAO.UsuarioDAO;
import br.com.novablues.model.Estoque;
import java.util.ArrayList;


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
