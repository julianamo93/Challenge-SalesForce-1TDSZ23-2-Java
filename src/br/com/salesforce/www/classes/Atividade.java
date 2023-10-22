package br.com.salesforce.www.classes;

public class Atividade {
    private String tipoAtividade;
    private String descricao;
    private String data;
    private String hora;
    private String idUser;
    private String idUsuarioResponsavel;

    public Atividade(){
    }

    public Atividade(String tipoAtividade, String descricao, String data, String hora, String idUser, String idUsuarioResponsavel) {
        this.tipoAtividade = tipoAtividade;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.idUser = idUser;
        this.idUsuarioResponsavel = idUsuarioResponsavel;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;

    }

    public String getIdUsuarioResponsavel() {
        return idUsuarioResponsavel;
    }

    public void setIdUsuarioResponsavel(String idUsuarioResponsavel) {
        this.idUsuarioResponsavel = idUsuarioResponsavel;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public void printAtividade() {
        System.out.println("Atividade: " + tipoAtividade);
        System.out.println("Descrição da atividade: " + descricao);
        System.out.println("Data: " + data);
        System.out.println("Horário: " + hora);
        System.out.println("ID e Usuário: " + idUser);
        System.out.println("ID Proprietário: " + idUsuarioResponsavel);
    }
}
