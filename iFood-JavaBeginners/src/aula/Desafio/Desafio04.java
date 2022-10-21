package Desafio;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

        if ((num%3==0) || (num%5==0)){
            System.out.println(fizzBuzz(num));
        } else {
            System.out.println(num);
        }
        
    }

    public static String fizzBuzz (int num){
      
        if ((num%3==0) && (num%5==0)){
          return "FizzBuzz";
        } else if ((num%3==0)){
          return "Fizz";
        } else if (num%5==0) {
          return "Buzz";
        } return null;        
    }
}
