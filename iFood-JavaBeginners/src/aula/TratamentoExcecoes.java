import javax.swing.JOptionPane;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        Boolean opcao = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

        try{
            Double resultado = dividir(Double.parseDouble(a),Double.parseDouble(b)); // O parseInt transforma String em Integer.
            //System.out.println("Resultado: "+ resultado);
            JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
            opcao=false;
            
        } catch (NumberFormatException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Entrada invalida! Informe um numero valido! Erro: "+ e.getMessage());

        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null,"Entrada invalida! O Denominador nao pode ser 0! Erro: "+ e.getMessage());
        } /*finally {
            System.out.println("Chegou no finally!"); // Não é obrigatório.
        }*/
        } while (opcao);
    }

    public static Double dividir (Double a, Double b) {return a/ b;}

}