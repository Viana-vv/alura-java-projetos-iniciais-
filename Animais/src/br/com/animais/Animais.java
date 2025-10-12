package br.com.animais;

public class Animais {
protected String nome;
private String correr;
private String pular;
private String barulho;
private String deitar;
private String comer;
private String necessidades;
private String acao;

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNecessidades() {
        return necessidades;
    }

    public void setNecessidades(String necessidades) {
        this.necessidades = necessidades;
    }

    public String getCorrer() {
        return correr;
    }

    public void setCorrer(String correr) {
        this.correr = correr;
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    public String getPular() {
        return pular;
    }

    public void setPular(String pular) {
        this.pular = pular;
    }

    public String getDeitar() {
        return deitar;
    }

    public void setDeitar(String deitar) {
        this.deitar = deitar;
    }

    public String getComer() {
        return comer;
    }

    public void setComer(String comer) {
        this.comer = comer;
    }
}
