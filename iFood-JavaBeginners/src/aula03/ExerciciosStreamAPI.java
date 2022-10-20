package aula03;

import java.util.Arrays;
import java.util.List;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
        Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        /* Padrão
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        });
         */
        
        /* Lambda
        numerosAleatorios.forEach(s -> System.out.println(s));
         */
        // Reference Method
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Converta essa lista de String em números inteiros: ");
        /*Padão
        numerosAleatorios.stream()
        .map(new Function<String,Integer>() {
            @Override
            public Integer apply(String s){
                return Integer.parseInt(s);
            }            
        });
         */
        /*
        List<Integer> collectList = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collections.toList());
        */
    }
}
