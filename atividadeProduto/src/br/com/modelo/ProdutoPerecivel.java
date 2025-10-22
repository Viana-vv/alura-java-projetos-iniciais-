package br.com.modelo;

public class ProdutoPerecivel extends Produto{
    private double dataValidade;


    public ProdutoPerecivel(String nome, int quantidade, double preco, double dataValidade) {
        super(nome, quantidade, preco);
        this.dataValidade = dataValidade;
    }
}
