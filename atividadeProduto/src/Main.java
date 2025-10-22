import br.com.modelo.Produto;
import br.com.modelo.ProdutoPerecivel;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 29, 399.00);
        //produto.setNome("Celular");
        //produto.setQuantidade(10);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Arroz", 12, 21.54, 08.09 );

        Produto outroProduto = new Produto("Outro celular", 17, 2888);
        //outroProduto.setNome("Segundo celular");
        //outroProduto.setQuantidade(1);


        ArrayList<Produto> produtos = new ArrayList<>();
       produtos.add(produto);
       produtos.add(outroProduto);
       produtos.add(produtoPerecivel);
       System.out.println("Primeiro celular: " + produtos.get(0).getNome());
        System.out.println("Produtos pereciveis: " + produtoPerecivel.toString());
        System.out.println("Todos os produtos: " + produtos.toString());
        System.out.println("Tamanho da lista: " + produtos.size());
        
    }
}
