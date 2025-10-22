package br.com.modelo;

public class Produto {
private String nome;
private double preco;
    private int quantidade;

    @Override
    public String toString() {
        return "Produto: " +
                "nome: '" + nome + '\'' +
                ", quantidade: " + quantidade +
                ",valor: " + preco;
    }

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
}
