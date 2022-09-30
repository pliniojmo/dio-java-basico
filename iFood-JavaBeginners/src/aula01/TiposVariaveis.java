package aula01;

import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("true ou false?");
        boolean valor = sc.nextBoolean();

        System.out.println(valor+" mas poderia ser "+!valor+"! Você está certo disso? ;D");

        String resultado = valor==true ? "Verdadeiro":"Falso";

        System.out.println(resultado);

        sc.close();
    }
}
