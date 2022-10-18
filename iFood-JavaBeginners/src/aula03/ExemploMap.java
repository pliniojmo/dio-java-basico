package aula03;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.sound.midi.Soundbank;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumo.");
        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");

        carrosPopulares.put("gol",15.2);

        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo uno está no dicionário: "+ carrosPopulares.containsKey("uno"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: "+carrosPopulares.keySet());
        //Set<String> modelos = carrosPopulares.keySet();
        //System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: "+carrosPopulares.values());
        //Collection<Double> consumos = carrosPopulares.values();
        //System.out.println(consumos);

        System.out.println("Exiba qual o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";

        for (Map.Entry<String,Double> entry:entries){
            if (entry.getValue().equals(consumoMaisEficiente)) modeloMaisEficiente = entry.getKey();            
        }
        System.out.println("Modelo mais Eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry: carrosPopulares.entrySet()){

            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: "+ modeloMenosEficiente + " - "+ consumoMenosEficiente);
            }

        }
        
        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();

        Double soma = 0.0;

        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos deste dicioário de carros: "+ (soma/carrosPopulares.size()));

        System.out.println(carrosPopulares.toString());

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next()== 15.6){
                iterator1.remove();
            }
        }

        System.out.println(carrosPopulares.toString());

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String,Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};

        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");

        Map<String,Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);

        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionário de carros.");

        carrosPopulares.clear();
        carrosPopulares1.clear();
        carrosPopulares2.clear();

        System.out.println("Dicionário vazio? " + carrosPopulares.isEmpty());


    }
}
