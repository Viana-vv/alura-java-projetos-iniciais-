package br.com.MinhasMusicas.NumerosPrimos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();
        int numeroEscolhido;
        System.out.println("Digite um numero para testar se é primo");
        Scanner listener = new Scanner(System.in);
        numeroEscolhido =  listener.nextInt();
        verificador.verificarSeEhPrimo(numeroEscolhido);
        int proximo = gerador.gerarProximoPrimo(17);
        System.out.println("Próximo primo depois de 17 é " + proximo);

        System.out.println("Lista de primos até 100: " + gerador.listarPrimos(100));
    }
}

