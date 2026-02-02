import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      int tentativas = 0;
//numero de tentativas fora para a contagem
        System.out.println("O computador está pensando em um número de 1 a 100.....");
        int numSorteado = (int) (Math.random() * 100) + 1;
        //sorteio dos números
while(tentativas <=10){
    System.out.println("Número de tentativas: " + tentativas);
    System.out.println("Tente adivinhar: ");
    Scanner leitor = new Scanner(System.in);
    //leitor só para colocar como variavel
    int numDigitado = leitor.nextInt();
    tentativas++;
    if(numSorteado > numDigitado){
        System.out.println("O seu palpite:  " + numDigitado);
        System.out.println("O número do computador é maior");
        if(Math.abs(numDigitado - numSorteado) <= 10 ){
            //Math.abs não tinha visto isso antes, ele pega o resultado entre os numeros, legal!
            //aprendi após avaliação
            System.out.println("Está quente!");
        } else if (Math.abs(numDigitado - numSorteado) <= 5) {
            System.out.println("Pegando fogo!!!");
        } else if (Math.abs(numDigitado - numSorteado) >= 20) {
            System.out.println("Está congelando!!");
        } else{
            System.out.println("Está frio");
        }

    } else if(numSorteado < numDigitado){
    System.out.println("O seu palpite:  " + numDigitado);
    System.out.println("O número do computador é menor");
        if(Math.abs(numDigitado - numSorteado) <= 10 ){
            System.out.println("Está quente!");
        } else if (Math.abs(numDigitado - numSorteado) <= 5) {
            System.out.println("Pegando fogo!!!");
        } else if (Math.abs(numDigitado - numSorteado) >= 20) {
            System.out.println("Está congelando!!");
        } else{
            System.out.println("Está frio");
        }

    }else{
        System.out.println("Acertou!! o número realmente é: " + numDigitado);
        System.out.println("Número de tentativas: " + tentativas);
       break;
    }

}

        if(tentativas == 10){
            System.out.println("Acabou suas tentativas!!, o número sorteado era: " + numSorteado);
        }
    }
}