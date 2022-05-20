/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import br.com.novablues.DAO.EstoqueDAO;
import br.com.novablues.model.Estoque;

/**
 *
 * @author Gui
 */
public class TesteDeCadastroDeProduto {
    public static void main(String[] args) {
        Estoque produto = new Estoque();
        
        produto.setNome_produto("Teclado sem fio");
        produto.setQuantidade(500);
        produto.setId_produto(15);
        produto.setValor_unit(450.00);
        
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        
        estoqueDAO.cadastrarProduto(produto);
        
        
        
    }
        
        
       
                
        
        
    
}
