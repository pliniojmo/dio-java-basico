package aula03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6]

        // List notas = new ArrayList(); // Antes do java 5
        // List <Double> notas = new ArrayList<>(); // Generics(jdk 5) - Diamont Operator (jdk 7) 
        // ArrayList<Double> notas = new ArrayList<>();
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));

        /*
        Criado dessa forma, não é possível add ou remover itens a lista.

        List<Double> notas = Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6);
        notas.add(10d);
        System.out.println(notas);
        */

        /*
        ImmutableList, parecido com o de cima.
        List<Double> notas = List.of(7d,8.5,9.3,5d,7d,0d,3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
         */
        
        System.out.println("Crie uma lista e adicione as set notas:");

        List <Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);
        // System.out.println(notas.toString()); // O mesmo que o de cima.

        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5.0)); // Exibe a posição da nota 5.0 na lista.

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0),6.0);
        System.out.println(notas);

        System.out.println("Conforme se a nota 5.0 está na lista: "+ notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exbia a maoir nota: "+ Collections.max(notas));

        System.out.print("Exiba a soma as notas: ");

        Iterator<Double> iterator = notas.iterator();
        Double soma=0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+= next;
        }
        System.out.println(soma);
        
        System.out.println("Exiba a média das notas: "+soma/notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7.0) iterator1.remove();
        }

        System.out.println(notas);

        System.out.println("Apague todas a lista: ");

        notas.clear();

        System.out.println(notas);

        System.out.println("Confirmação se a lista está vazia: "+notas.isEmpty());
        

        

    }
}
