package br.com.novablues.model;

public class Pessoa {

    private String id_usuario;
    private String nome_usuario;
    private String email;
    private String senha;
    private String acesso;
    private int id;
    private String nome;
    private String CPF;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String id_usuario, String nome_usuario, String email, String senha, String acesso) {
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.senha = senha;
        this.acesso = acesso;
    }

    public Pessoa(String id_usuario, String nome_usuario) {
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
    }

    public Pessoa(String nome_usuario, String email, String senha, String acesso) {
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.senha = senha;
        this.acesso = acesso;
    }

    public Pessoa(int id, String nome, String CPF, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
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

}
