import java.util.Objects;
import java.util.Scanner;

//Eu após terminar verifiquei com o chat COPILOT
// algumas coisas podem ser melhoraradas e será no proximo
// entendi como usar outras coisas, poderia ter colocado tbm como Adicionar potência (^) e raiz quadrada.
// aprendi que da tbm para simplificar o while com breack
//todos os comentarios foram feitos por mim mesmo após a analise do copilot
public class Main {
    public static void main(String[] args) {
        Scanner numeroDigitado = new Scanner(System.in);
        int fim = 0;
        //teoricamente não precisa dessa linha acima
        while(fim == 0){
            System.out.println("---------"+
                    "\nDigite o primeiro número: "+
                    "\n---------");
            double numero1 = numeroDigitado.nextDouble();
            System.out.println("---------"+
                    "\nDigite o segundo número: "+
                    "\n---------");
            double numero2 = numeroDigitado.nextDouble();

            System.out.println(" Digite qual operação você deseja realizar: "+
                    "\n + , - , / , x");
            Scanner operacaoDigitada = new Scanner(System.in);
        String operacao = operacaoDigitada.next();
switch (operacao) {
    case "+":
        System.out.println("Seu resultado é: " + (numero1 + numero2));
        break;
    case "-":
        System.out.println( "Seu resultado é: " + (numero1 - numero2));
        break;
    case "/":
       if (numero2 == 0 ) {
            System.out.println("Não pode dividir números por 0!");
            break;
        }else {
            System.out.println( "Seu resultado é: " + (numero1 / numero2));
            break;
        }
    case "x":
        System.out.println( "Seu resultado é: " + (numero1 * numero2));
        break;
    default:
        //faltou duas operações
        System.out.println("tente novamente");
        break;
}


            System.out.println("Digite 'sim' para sair! ou qualquer tecla para continuar");
Scanner sair = new Scanner(System.in);
String digitouSim = sair.next();
if (digitouSim.equalsIgnoreCase("sim")){
    System.out.println("Fechando calculadora....");
    fim++;
}}}}
