import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios = new int[20];
        
        for(int i=0;i<numerosAleatorios.length;i++){
            int numero = random.nextInt(100);    
            if (numero == 100){
                System.out.println(numero+"Critico!");
            } else {
                System.out.println(numero);
            }

        }
    }
}
