package br.com.salesforce.www.classes;

import java.util.Random;

public class Cadastro {
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String empresa;
    private String funcao;
    private String telefoneContato;
    private String nomeUsuario;
    private String senha;


    public Cadastro(){
        this.id = gerarId();
    }

    public Cadastro(String nome, String sobrenome, String email, String empresa, String funcao, String telefoneContato, String nomeUsuario, String senha) {
        this.id = gerarId();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.empresa = empresa;
        this.funcao = funcao;
        this.telefoneContato = telefoneContato;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int gerarId() {
        Random rand = new Random();
        return rand.nextInt(9000) + 1000; // Gera um número aleatório entre 1000 e 9999
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMenuAcessibilidade(){
        return getMenuAcessibilidade();
    }
}
