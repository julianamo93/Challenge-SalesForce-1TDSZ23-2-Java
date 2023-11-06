package br.com.salesforce.www.classes;

public class Cadastro {
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String empresa;
    private String funcao;
    private String telefoneContato;
    private String novoUsuario;
    private Acessibilidade acessibilidade;


    public Cadastro() {
    }

    public Cadastro(int id, String nome, String sobrenome, String email, String empresa, String funcao, String telefoneContato, String novoUsuario, Acessibilidade acessibilidade, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.empresa = empresa;
        this.funcao = funcao;
        this.telefoneContato = telefoneContato;
        this.novoUsuario = novoUsuario;
        this.acessibilidade = acessibilidade;
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

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getNovoUsuario() {
        return novoUsuario;
    }

    public void setNovoUsuario(String novoUsuario) {
        this.novoUsuario = novoUsuario;
    }

    public Acessibilidade getAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(Acessibilidade acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public void printCadastro() {
        System.out.println("Nome completo: " + nome + sobrenome);
        System.out.println("E-mail: " + email);
        System.out.println("Empresa: " + empresa);
        System.out.println("Telefone: " + telefoneContato);
        System.out.println("Usuário: " + novoUsuario);

    }

    public void setUsuario(String usuario) {
    }
    
    public void getUsuario(String usuario) {        
    }

    public Object getUsuario() {
        return null;
    }


}
