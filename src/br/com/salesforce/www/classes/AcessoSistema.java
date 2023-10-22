package br.com.salesforce.www.classes;

public class AcessoSistema {
    private String dataHora;

    public AcessoSistema() {
    }

    public AcessoSistema(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public void printAcessoSistema() {
        System.out.println("Acessado às: " + dataHora);
    }
}
