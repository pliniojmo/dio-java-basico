import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] consoantes= new String[6];
        int quantidadeConsoantes=0;

        int cont=0;

        do{
            System.out.println("Letra: ");
            String letra = sc.next();
            if (!(letra.equalsIgnoreCase("a")||
                letra.equalsIgnoreCase("e")||
                letra.equalsIgnoreCase("i")||
                letra.equalsIgnoreCase("o")||
                letra.equalsIgnoreCase("u"))){
                    consoantes[cont]=letra;
                    quantidadeConsoantes++;
                }
                cont++;
        }while(cont<consoantes.length);
        System.out.println("Quantidade de consoantes: "+quantidadeConsoantes);
    }
}
