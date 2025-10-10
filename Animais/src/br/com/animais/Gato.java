package br.com.animais;

public class Gato extends Animais {
private String acao = "arranhou o sofá";

    @Override
    public String getAcao() {
        return acao;
    }

    @Override
    public void setAcao(String acao) {
        this.acao = acao;
    }
}
