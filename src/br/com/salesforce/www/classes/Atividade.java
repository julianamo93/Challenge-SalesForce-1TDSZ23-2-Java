package br.com.salesforce.www.classes;

public class Atividade {
    private String tipoAtividade;
    private String descricao;
    private String data;
    private String hora;
    private int idUser;
    private int idUsuarioResponsavel;

    public Atividade(){
    }

    public Atividade(String tipoAtividade, String descricao, String data, String hora, int idUser, int idUsuarioResponsavel) {
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

    public int getIdUsuarioResponsavel() {
        return idUsuarioResponsavel;
    }

    public void setIdUsuarioResponsavel(int idUsuarioResponsavel) {
         this.idUsuarioResponsavel = idUsuarioResponsavel;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
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
