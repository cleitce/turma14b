package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, pares;
        final int QTD_NUMEROS = 10; // final cria uma CONSTANTE

        pares = 0;

        for (int i = 1; i <= QTD_NUMEROS; i++) {
            
            System.out.printf("Digite o %dº número: ", i);
            numero = in.nextInt();

            if (numero % 2 == 0) { // verifica se o número é par
                pares++;
            } 
        }

        System.out.printf("Foram digitados %d par(es) e %d ímpar(es).\n", pares, QTD_NUMEROS - pares);

        in.close();
    }
}
