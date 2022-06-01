
package br.com.novablues.model;


public class Cliente {

    private int id;
    private String nome;
    private String CPF;
    private String telefone;
    private String email;

      public Cliente() {
    }
    
    public Cliente(int id, String nome, String CPF, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
    } 

    public Cliente(String CPF) {
        this.CPF = CPF;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", CPF=" + CPF + ", telefone=" + telefone + ", email=" + email + '}';
    }

}
