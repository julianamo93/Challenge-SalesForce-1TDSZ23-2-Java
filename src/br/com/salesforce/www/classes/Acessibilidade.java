package br.com.salesforce.www.classes;

public class Acessibilidade extends Cadastro {
    private String menuAcessibilidade;
    private String tipoDispositivo;
    private String navegador;

    public Acessibilidade() {
    }

    public Acessibilidade(String menuAcessibilidade, String tipoDispositivo, String navegador) {
        this.menuAcessibilidade = menuAcessibilidade;
        this.tipoDispositivo = tipoDispositivo;
        this.navegador = navegador;
    }

    @Override
    public String getMenuAcessibilidade() {
        return menuAcessibilidade;
    }

    public void setMenuAcessibilidade(String menuAcessibilidade) {
        this.menuAcessibilidade = menuAcessibilidade;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public void setNavegador() {
    }

    public void exibeMenuAcessibilidade() {
        System.out.println("Acessibilidade: " + getMenuAcessibilidade());

    }

}
