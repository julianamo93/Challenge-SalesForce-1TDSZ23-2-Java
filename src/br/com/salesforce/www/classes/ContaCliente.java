package br.com.salesforce.www.classes;

public class ContaCliente {
    private String idUsuario;
    private String user;

    public ContaCliente() {
    }

    public ContaCliente(String idUsuario, String user) {
        this.idUsuario = idUsuario;
        this.user = user;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void printConta() {
        System.out.println("ID: " + idUsuario);
        System.out.println("User: " + user);
    }
}
