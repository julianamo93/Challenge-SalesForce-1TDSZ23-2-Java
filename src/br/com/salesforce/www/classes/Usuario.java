package br.com.salesforce.www.classes;

public class Usuario extends Cadastro {
    private String cpf;
    private String login;

    public Usuario() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Usuario(String login) {
        this.login = login;
    }

    public void add(Cadastro cadastro) {
    }

    public Acessibilidade getAcessibilidade() {
        return getAcessibilidade();
    }

    public void setAcessibilidade(Acessibilidade acessibilidade) {
    }

    public String getLogin() {
        return getNomeUsuario();
    }

}


