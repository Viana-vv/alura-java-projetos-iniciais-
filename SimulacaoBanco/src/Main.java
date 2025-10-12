import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente saldo = new ContaCorrente();
        saldo.saldoComTarifa();
        int sair = 0;
        while(sair == 0 ){
            System.out.println("\n   "

                    +" Seu saldo é de:" + saldo.getSaldo() + """
                \n
                Escolha uma das opções abaixo
                1 - Consultar Saldo
                2 - Depositar 
                3 - Sacar
                4 - Sair
                """);
            System.out.println("Digite uma das opções:");
            Scanner numeroEscolhido = new Scanner(System.in);
            int acaoDesejada = numeroEscolhido.nextInt();
            switch (acaoDesejada) {
                case 1:
                    System.out.println("\nEste é teu saldo total: " + saldo.getSaldo() + ".");
                    break;

                case 2:
                    //Coloquei para somar para utilizar outro exemplo alem de retirar o valor.
                    System.out.println("Digite um valor para depositar na sua conta");
                    double valorDepositar = numeroEscolhido.nextDouble();
                    saldo.depositar(valorDepositar);
                    break;
                case 3:
                    System.out.println("Digite um valor para sacar da sua conta");
                    double valorSacar = numeroEscolhido.nextDouble();
                    if (valorSacar > saldo.getSaldo()) {
                        System.out.println("Valor maior que o saldo!, tente novamente!");
                    } else {
                        saldo.sacar(valorSacar);
                        System.out.println("\nSeu saque foi finalizado" + "\n o valor retirado foi " + valorSacar);
                    }
                    break;
                case 4:
                    System.out.println("Saindo!");
                    sair++;
                    break;
                default:
                    System.out.println("Escolha um numero valido!");
                    break;
            }
        }
    }
}