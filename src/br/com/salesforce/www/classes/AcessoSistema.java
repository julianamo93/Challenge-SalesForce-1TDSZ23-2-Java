package br.com.salesforce.www.classes;

public interface AcessoSistema {
    boolean login(String login, String senha);

    void logout();
}
