package br.com.salesforce.www.classes;

public class Usuario extends Cadastro {
    private String senha;
    private ContaCliente conta;
    private Atividade atividade;
    private Acessibilidade acessibilidade;
    private AcessoSistema acesso;


    public Usuario() {
    }

    public Usuario(String senha, ContaCliente conta, Atividade atividade, Acessibilidade acessibilidade, AcessoSistema acesso) {
        this.senha = senha;
        this.conta = conta;
        this.atividade = atividade;
        this.acessibilidade = acessibilidade;
        this.acesso = acesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    @Override
    public void getUsuario(String usuario) {
        super.getUsuario(usuario);
    }

    public AcessoSistema getAcesso() {
        return acesso;
    }

    public void setAcesso(AcessoSistema acesso) {
        this.acesso = acesso;
    }

    public void printInfoUsuario() {
        System.out.println("ID: " + getId());
        System.out.println("Senha: " + getSenha());
        System.out.println("Função: " + getFuncao());
    }

}
