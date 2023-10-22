package br.com.salesforce.www.classes;

public class Acessibilidade {
    private String ferramentaAcessibilidade;
    private String tipoDeDispositivo;
    private String navegador;
    private String localizacaoGeografica;

    public Acessibilidade() {
    }

    public Acessibilidade(String ferramentaAcessibilidade, String tipoDeDispositivo, String navegador, String localizacaoGeografica) {
        this.ferramentaAcessibilidade = ferramentaAcessibilidade;
        this.tipoDeDispositivo = tipoDeDispositivo;
        this.navegador = navegador;
        this.localizacaoGeografica = localizacaoGeografica;
    }

    public void setFerramentaAcessibilidade(String ferramentaAcessibilidade) {
        this.ferramentaAcessibilidade = ferramentaAcessibilidade;
    }

    public String getFerramentaAcessibilidade() {
        return ferramentaAcessibilidade;
    }

    public String getTipoDeDispositivo() {
        return tipoDeDispositivo;
    }

    public void setTipoDeDispositivo(String tipoDeDispositivo) {
        this.tipoDeDispositivo = tipoDeDispositivo;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public String getLocalizacaoGeografica() {
        return localizacaoGeografica;
    }

    public void setLocalizacaoGeografica(String localizacaoGeografica) {
        this.localizacaoGeografica = localizacaoGeografica;
    }

    public void printAcessibilidade() {
        System.out.println("Ferramenta escolhida: " + ferramentaAcessibilidade);
        System.out.println("Dispositivo de acesso: " + tipoDeDispositivo);
        System.out.println("Browser: " + navegador);
        System.out.println("Localização: " + localizacaoGeografica);
    }
}
