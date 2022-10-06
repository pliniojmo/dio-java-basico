import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        int [] vetor = {0,5,10,15,20,25};

        for(int i=0;i<vetor.length; i++ ){
            System.out.println(vetor[i]);
        }
        for(int i=vetor.length-1;i>0; i-- ){
            System.out.println(vetor[i]);
        }       
      
    }
}
