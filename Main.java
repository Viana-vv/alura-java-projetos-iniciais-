import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Andre Vinicios";
        double senha = 376253674;
        String conta = "Corrente";
        int opcaoDesejada;
        double saldo  = 1500;
        boolean continuar = true ;
        double valorDesejado;
        double senhaDigitada;
        String menu;

        menu = """
             Operações: 
                     1- Consultar saldo
                     2- Receber valor
                     3- Transferir valor
                     4- Sair
                      Digite a opção desejada:
            """;

        System.out.println("***********************\n");
        System.out.println("Nome do usuario: "+ nome);
        System.out.println("Tipo de conta: "+ conta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("\n***********************");

        while(continuar != false) {
            System.out.println(menu);
            opcaoDesejada = leitura.nextInt();
            switch (opcaoDesejada) {
                case 1:
                    System.out.println("O seu saldo é de: " + saldo);
                    break;
                case 2:
                    System.out.println("Quantos reais vc vai receber?");
                    valorDesejado = leitura.nextDouble();
                    saldo += valorDesejado;
                    System.out.println("O seu novo saldo é de: " + saldo);
                    break;
                case 3:
                    System.out.println("Primeiro digite a senha: ");
                    senhaDigitada = leitura.nextDouble();
                    if(senhaDigitada != senha) {
                        System.out.println("Senha Incorreta, tente novamente.");
                        senhaDigitada = leitura.nextDouble();
                        while(senhaDigitada != senha) {
                            System.out.println("Senha Incorreta, tente novamente.");
                            senhaDigitada = leitura.nextDouble();
                        }
                    }
                    System.out.println("Quanto vc quer transferir?");
                    valorDesejado = leitura.nextDouble();

                    if (valorDesejado > saldo) {
                        System.out.println("você não tem saldo suficiente, tente novamente.");
                        valorDesejado = leitura.nextDouble();
                        while (valorDesejado > saldo) {
                            System.out.println("você não tem saldo suficiente, tente novamente.");
                            valorDesejado = leitura.nextDouble();
                        }
                    } else {
                        saldo -= valorDesejado;
                        System.out.println("Valor transferido com sucesso!!!");
                        System.out.println("Seu  saldo atual é de: " + saldo);
                        break;
                    }
                case 4:
                    continuar = false ;
                    break;
            }
        }
    }
}
