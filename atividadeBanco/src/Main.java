import ContaBancaria.ContaBancaria;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1, 293.00);
        ContaBancaria segundaConta = new ContaBancaria(2, 2453.99);
        ContaBancaria terceiraConta = new ContaBancaria(3, 24.55);

        ArrayList<ContaBancaria> contas =  new ArrayList<>();
        contas.add(conta);
        contas.add(segundaConta);
        contas.add(terceiraConta);

        ContaBancaria maiorConta = Collections.max(contas, Comparator.comparing(ContaBancaria::getSaldo));
        System.out.println("Conta com maior saldo: "+ maiorConta.numeroConta + "Com o valor de: "+ maiorConta.getSaldo());


    }
    }
