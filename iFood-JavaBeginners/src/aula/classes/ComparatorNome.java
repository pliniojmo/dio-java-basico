package classes;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        // TODO Auto-generated method stub
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}