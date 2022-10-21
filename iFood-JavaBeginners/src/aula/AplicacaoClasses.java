import classes.ClasseFilha1;
import classes.ClasseFilha2;
import classes.ClasseMae;

public class AplicacaoClasses {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new ClasseMae(), new ClasseFilha1(),new ClasseFilha2()};

        for (ClasseMae classe: classes){
            classe.metodo1();
        }

        System.out.println("");
        
        for (ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
