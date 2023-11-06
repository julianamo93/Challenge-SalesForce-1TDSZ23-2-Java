package br.com.salesforce.www.classes;

public class ContaCliente {
    private int idUsuario;
    private String user;

    public ContaCliente() {
    }

    public ContaCliente(int idUsuario, String user) {
        this.idUsuario = idUsuario;
        this.user = user;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
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
