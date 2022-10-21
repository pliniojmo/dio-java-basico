package classes;

public class Calc implements OperacaoMatematica {


    /* É obrigado utilizar todos os métodos da
     * classes.OperacaoMatematica, caso contrário ocorrerá
     * erro de compilação.
     */

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