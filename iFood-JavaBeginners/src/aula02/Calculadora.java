package aula02;

/* É obrigado utilizar todos os métodos da
 * OperacaoMatematica, caso contrário ocorrerá
 * erro de compilação.
 */

public class Calculadora implements OperacaoMatematica {
    
    @Override
    public void soma(double operando1, double operando2){
        System.out.println("Soma: "+ operando1+operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("Soma: "+ operando1+operando2);
    }

    @Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println("Soma: "+ operando1+operando2);
    }

    @Override
    public void divisao(double operando1, double operando2){
        System.out.println("Soma: "+ operando1+operando2);
    }
}
