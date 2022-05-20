/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import br.com.novablues.DAO.ClienteDAO;
import br.com.novablues.model.Cliente;

/**
 *
 * @author Gui
 */
public class TesteDeCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
//        cliente.setNome("Alan dos Santos");
//        cliente.setCPF("40028922");
//        cliente.setTelefone("119123456789");
//        cliente.setEmail("alan.santos@novablues.com.br");
        cliente.setId(2);

        
        ClienteDAO clienteDAO = new ClienteDAO();
        
//        clienteDAO.cadastrarCliente(cliente);

        clienteDAO.excluirCliente(cliente);
    }
}
