package Desafio;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        //TODO: Imprima o somatório de N (utilize o método "somatorio").
        
        int n = numero.nextInt();

        System.out.println(somatorio(n));
        
    }
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
