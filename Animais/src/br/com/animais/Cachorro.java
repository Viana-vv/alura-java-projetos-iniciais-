package br.com.animais;

public class Cachorro extends Animais{
private String acao = "abanou o rabo";
@Override
    public String getAcao() {
        return acao;
    }
@Override
    public void setAcao(String acao) {
        this.acao = acao;
    }

}
