import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
int end = 0;
        while (end < 1){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite se você quer par ou impar: ");
        String opcao = leitor.next().toLowerCase();
        switch (opcao){
            case "par":
                System.out.println("Digite um número para gerar números pares até ele");
                int numDigitado = leitor.nextInt();
                int numberPar = 0;
                while ( numberPar <= numDigitado ) {
                    System.out.println("i = " + numberPar );
                    numberPar += 2;
                }
             break;
            case "impar":
                System.out.println("Digite um número para gerar números impares até ele");
                int numDigitadoImpar = leitor.nextInt();
                int numberImpar = 1;
                while ( numberImpar <= numDigitadoImpar ) {
                    System.out.println("i = " + numberImpar );
                    numberImpar += 2;
                }
                break;
            default:
                System.out.println("Digite apenas opções validas!");
        }

            System.out.println("Você deseja continuar? Sim ou Não?");
            String fim = leitor.next().toLowerCase();
            switch (fim){
                case "não":
                    System.out.println("Finalizando....");
                    end++;
                    break;
                case "sim":
                    System.out.println("Voltando ao inicio: ");
                    break;
                default:
                    System.out.println("Digite apenas opções validas");
                    break;
            }
    }}
}