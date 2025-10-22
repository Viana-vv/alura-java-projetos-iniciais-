import br.com.pessoa.Pessoa;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("André");
        pessoa.setIdade(10);

        Pessoa segundaPessoa = new Pessoa();
    segundaPessoa.setNome("Vinicios");
    segundaPessoa.setIdade(12);

    Pessoa terceiraPessoa = new Pessoa();
   terceiraPessoa.setNome("Barbara");
    terceiraPessoa.setIdade(15);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa);
        listaDePessoas.add(segundaPessoa);
        listaDePessoas.add(terceiraPessoa);
        System.out.println("Tamanho da lista; " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas.toString());
    }
    }
