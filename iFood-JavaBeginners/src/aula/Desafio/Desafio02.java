package Desafio;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        int A, N;
        int total,cont=0;

        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        N = input.nextInt();
        
        total=0;
        
        while (cont!=N){
            cont+=A;
            total+=cont;
        }
        System.out.println(total);
        
    }
}
