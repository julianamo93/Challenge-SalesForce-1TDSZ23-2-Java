package br.com.salesforce.www.classes;

public class Usuario {
    private String id;
    private String senha;
    private String funcao;
    private ContaCliente conta;
    private Atividade atividade;
    private Acessibilidade acessibilidade;
    private AcessoSistema acesso;


    public Usuario() {
    }

    public Usuario(String id, String senha, String funcao, ContaCliente conta, Atividade atividade, Acessibilidade acessibilidade, AcessoSistema acesso) {
        this.id = id;
        this.senha = senha;
        this.funcao = funcao;
        this.conta = conta;
        this.atividade = atividade;
        this.acessibilidade = acessibilidade;
        this.acesso = acesso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public ContaCliente getConta() {
        return conta;
    }

    public void setConta(ContaCliente conta) {
        this.conta = conta;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Acessibilidade getAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(Acessibilidade acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public AcessoSistema getAcesso() {
        return acesso;
    }

    public void setAcesso(AcessoSistema acesso) {
        this.acesso = acesso;
    }

    public void printInfoUsuario() {
        System.out.println("ID: " + id);
        System.out.println("Senha: " + id);
        System.out.println("Função: " + funcao);
    }


}
