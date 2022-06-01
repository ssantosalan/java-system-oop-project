
package br.com.novablues.model;

public class Usuario {

    private int id_usuario;
    private String nome_usuario;
    private String email;
    private String senha;
    private String acesso;

    public Usuario() {

    }

    public Usuario(String nome_usuario, String email, String senha, String acesso) {
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.senha = senha;
        this.acesso = acesso;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

}
