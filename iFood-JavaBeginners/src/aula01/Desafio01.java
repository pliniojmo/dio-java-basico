import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a == b) {
          System.out.println("Sao iguais!");
        } else {
          System.out.println("Nao sao iguais!");
        }
    }
}
