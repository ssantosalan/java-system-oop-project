package br.com.novablues.model;

public class Cliente extends Pessoa {

    public Cliente() {
        super();
    }

    public Cliente(int id, String nome, String CPF, String telefone, String email) {
        super(id, nome, CPF, telefone, email);
    }

}
