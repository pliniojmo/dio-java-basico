import classes.Contato;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("-- Ordem aleatória --");
        System.out.println("");
        Map<Integer, Contato> agenda = new HashMap<>(){{ //HashMap - Cria de forma aleatória.
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};

        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue().getNome()+ " - " + entry.getValue().getNumero());
        };
        System.out.println("");
        System.out.println("-- Ordem Inserção --");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{ // LinkedHashMap - Ordem de inserção.
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println("");
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue().getNome()+ " - " + entry.getValue().getNumero());
        };
        System.out.println("");
        System.out.println("-- Ordem de ID --");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda); // Ordem por chaves. ID
        System.out.println("");
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue().getNome()+ " - " + entry.getValue().getNumero());
        };
        System.out.println("");
        System.out.println("-- Ordem por telefone --");
        //Set <Map.Entry<Integer, classes.Contato>> set = new TreeSet<>(new classes.ComparatorOrdemNumerica());

        //Clase Anônima
        /*Set <Map.Entry<Integer, classes.Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, classes.Contato>>(){
            @Override
            public int compare(Map.Entry<Integer,classes.Contato> cont1,Map.Entry<Integer,classes.Contato>cont2){
                return Integer.compare(cont1.getValue().getNumero(),cont2.getValue().getNumero());
            }                    
        });
        */
        // Comparator.comparing
        /*
        Set <Map.Entry<Integer, classes.Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, classes.Contato>,Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, classes.Contato> cont){
                return cont.getValue().getNumero();
            }
        }));
         */
        //Lambda
        Set <Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));

        System.out.println("");
        set.addAll(agenda.entrySet());
        for(Map.Entry<Integer,Contato>entry:set){
            System.out.println(entry.getKey()+ " - " + entry.getValue().getNome()+ " - " + entry.getValue().getNumero());
        };
        System.out.println("");
    }
}
