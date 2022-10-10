import java.util.Scanner;

public class Dasafio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        
        int num = leitor.nextInt();

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        int posicao=0;
        
        String resposta="Numero "+ num +" nao encontrado!";
        for (int i=0;i<elementos.length;i++){
            if (num==elementos[i]) {
                posicao=i;                
            }
        }

        if (posicao!=0){
            System.out.println("Achei "+num+" na posicao "+posicao); 
        } else {
            System.out.println(resposta);
        }

        
    }
}
