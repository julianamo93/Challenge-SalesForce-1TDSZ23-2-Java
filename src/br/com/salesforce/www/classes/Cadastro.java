package br.com.salesforce.www.classes;

public class Cadastro {
    private String nome;
    private String sobrenome;
    private String email;
    private String empresa;
    private double telefoneContato;
    private String novoUsuario;
    private Usuario usuario;


    public Cadastro() {
    }

    public Cadastro(String nome, String sobrenome, String email, String empresa, double telefoneContato, String novoUsuario, Usuario usuario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.empresa = empresa;
        this.telefoneContato = telefoneContato;
        this.novoUsuario = novoUsuario;
        this.usuario = usuario;
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

    public double getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(double telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getNovoUsuario() {
        return novoUsuario;
    }

    public void setNovoUsuario(String novoUsuario) {
        this.novoUsuario = novoUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void printCadastro() {
        System.out.println("Nome completo: " + nome + sobrenome);
        System.out.println("E-mail: " + email);
        System.out.println("Empresa: " + empresa);
        System.out.println("Telefone: " + telefoneContato);
        System.out.println("Usuário: " + novoUsuario);

    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
    }

}
