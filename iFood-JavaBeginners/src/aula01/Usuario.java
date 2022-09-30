import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? "+smartTV.ligada);
        System.out.println("Canal atual: "+smartTV.canal);
        System.out.println("Volume atual: "+smartTV.volume);
        

        smartTV.ligar();
        System.out.println("Novo Status --> TV ligada? "+smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();

        System.out.println("Novo Status --> TV ligada? "+smartTV.ligada);
        System.out.println("Novo Status --> Canal atual: "+smartTV.canal);
        System.out.println("Novo Status --> Volume atual: "+smartTV.volume);

        System.out.println("Informar novo canal: ");
        Scanner sc = new Scanner(System.in);
        int novoCanal = sc.nextInt();
        smartTV.mudarCanal(novoCanal);
        System.out.println("Novo Status --> Canal atual: "+smartTV.canal);

        System.out.println("Novo Status --> TV ligada? "+smartTV.ligada);
        System.out.println("Novo Status --> Canal atual: "+smartTV.canal);
        System.out.println("Novo Status --> Volume atual: "+smartTV.volume);

        smartTV.desligar();
        sc.close();
    }
}
