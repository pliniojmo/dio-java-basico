import classes.ComparatorNome;
import classes.Livro;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("-- Ordem aleatória --");

        Map<String, Livro> meusLivos = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};

        for (Map.Entry<String, Livro> livro: meusLivos.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-- Ordem Inserção --");

        Map<String, Livro> meusLivos1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};

        for (Map.Entry<String, Livro> livro: meusLivos1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-- Ordem alfabética autores --");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivos1);

        for (Map.Entry<String, Livro> livro: meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-- Ordem alfabética dos nomes dos livros --");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivos.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

    }
    
}
