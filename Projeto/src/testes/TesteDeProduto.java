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
public class TesteDeProduto {

    public static void main(String[] args) {
        Estoque produto = new Estoque();

        //produto.setNome_produto("Suporte com cooler p/ notebook");
       // produto.setQuantidade(500);
     //   produto.setValor_unit(100.00);

        EstoqueDAO estoqueDAO = new EstoqueDAO();
        
        
//        for(Estoque c : estoqueDAO.ListagemProdutos()) {
//			System.out.println("ID: " + c.getId_produto());
//                        System.out.println("Nome: " + c.getNome_produto());
//                        System.out.println("Quantidade: " + c.getQuantidade());
//                        System.out.println("Valor: " + c.getValor_unit());
//			
//		}
        
       // estoqueDAO.cadastrarProduto(produto);
       // estoqueDAO.excluirProduto(produto);
        
        //Fazer tratamento para verificar informações da descrição do produto usando um try-catch
        

        
        String name = "Acer";
		
		for(Estoque c : estoqueDAO.ListagemForName(name)) {
			System.out.println("Contato: " + c.getNome_produto());
			
		}
    }

}
