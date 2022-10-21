import classes.SmartTv;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.getCanal());
        System.out.println("Volume atual: "+smartTv.getVolume());
        

        smartTv.ligar();
        System.out.println("Novo Status --> TV ligada? "+smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Novo Status --> TV ligada? "+smartTv.ligada);
        System.out.println("Novo Status --> Canal atual: "+smartTv.getCanal());
        System.out.println("Novo Status --> Volume atual: "+smartTv.getVolume());

        System.out.println("Informar novo canal: ");
        Scanner sc = new Scanner(System.in);
        int novoCanal = sc.nextInt();
        smartTv.mudarCanal(novoCanal);
        System.out.println("Novo Status --> Canal atual: "+smartTv.getCanal());

        System.out.println("Novo Status --> TV ligada? "+smartTv.ligada);
        System.out.println("Novo Status --> Canal atual: "+smartTv.getCanal());
        System.out.println("Novo Status --> Volume atual: "+smartTv.getVolume());

        smartTv.desligar();
        sc.close();
    }
}
