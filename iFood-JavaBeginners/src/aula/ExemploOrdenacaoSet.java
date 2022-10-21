import classes.ComparatoNomeGeneroTempoEpisodio;
import classes.Serie;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-- Ordem aleatória --");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};
        for (Serie serie:minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();
        System.out.println("-- Ordem inserção --");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};
        for (Serie serie:minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();
        System.out.println("-- Ordem natural (TempoEpisodio) --");
        Set<Serie> minhasSerias2 = new TreeSet<>(minhasSeries);
        for (Serie serie:minhasSerias2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();
        System.out.println("-- Ordem Nome/Gênero/TempoEpisodio --");
        Set<Serie> minhasSerias3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSerias3.addAll(minhasSeries);
        for (Serie serie:minhasSerias3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


    }
}
