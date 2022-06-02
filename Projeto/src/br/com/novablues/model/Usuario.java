
package br.com.novablues.model;

public class Usuario extends Pessoa {
    
    public Usuario(){
        super();
    }

    public Usuario(String id_usuario, String nome_usuario){
        super(id_usuario, nome_usuario);
    }
    
    public Usuario (String nome_usuario, String email, String senha, String acesso){
        super(nome_usuario, email, senha, acesso);
    }
    }

