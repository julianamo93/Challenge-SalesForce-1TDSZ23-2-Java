package br.com.salesforce.www.classes;

public class ContaEmpresa extends Cadastro {
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String userEmpresa;

    public ContaEmpresa() {
    }

    public ContaEmpresa(String cnpj, String nomeFantasia, String razaoSocial, String userEmpresa) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.userEmpresa = userEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getUserEmpresa() {
        return userEmpresa;
    }

    public void setUserEmpresa(String userEmpresa) {
        this.userEmpresa = userEmpresa;
    }

}
