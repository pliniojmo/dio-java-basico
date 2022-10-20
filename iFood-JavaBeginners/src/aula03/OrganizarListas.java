package aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
         * Dadas as seguintes informações sobre meus gatos, crie uma lista e ordene asta lista exibindo: (nome - idade - cor);
         * Gato 1 = nome: Jon, idade: 18, cor: preto
         * Gato 2 = nome: Simba, idade: 6, cor: tigrado
         * Gato 3 = nome: Jon, idade: 12, cor: amarelo
         */
public class OrganizarListas {
    public static void main(String[] args) {        

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Caramelo", 18, "amarelo"));
        }};
        System.out.println(meusGatos);

        System.out.println("Ordem nome: ");

        //reference method
        meusGatos.sort(Comparator.comparing(Gato::getNome));

        System.out.println(meusGatos);
        
        System.out.println("Ordem aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Natural: ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Idade: ");
        //Collections.sort(meusGatos, new ComparatorIdade()); // Ou esse ou o outro faz a mesma coisa.
        meusGatos.sort(new comparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem Cor");
        meusGatos.sort(new comparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome, Cor e Idade: ");
        meusGatos.sort(new comparatorNomeCorIdade());
        System.out.println(meusGatos);

    }

    public static class comparatorIdade implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2){
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }

    public static class comparatorCor implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2){
            return g1.getCor().compareToIgnoreCase(g2.getCor());
        }
    }

    public static class comparatorNomeCorIdade implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2){
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if (nome !=0) return nome;
            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if (cor !=0) return cor;
            
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
}
