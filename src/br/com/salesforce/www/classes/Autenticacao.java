package br.com.salesforce.www.classes;

import java.util.ArrayList;

public class Autenticacao implements AcessoSistema {
    private Usuario usuarioLogado;
    private ArrayList<Cadastro> cadastros;

    public Autenticacao(ArrayList<Cadastro> cadastros) {
        this.cadastros = cadastros;
    }

    @Override
    public boolean login(String login, String senha) {
        for (Cadastro cadastro : cadastros) {
            if (cadastro instanceof Usuario user) {
                String nomeUsuario = user.getNomeUsuario();
                String senhaUsuario = user.getSenha();
                if (nomeUsuario.equals(login) && senhaUsuario.equals(senha)) {
                    usuarioLogado = user;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void logout() {
        usuarioLogado = null;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }
}







