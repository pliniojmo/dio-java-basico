import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada_1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");// romances-blake-crouch.txt

        imprimirArquivoNoConsole(nomeDoArquivo);
    }

    public static void imprimirArquivoNoConsole (String nomeDoArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    
            do {
                bw.write(line);
                bw.newLine();
                line=br.readLine();

            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro não esperado! Entre em contato com o suporte."+ e.getMessage());
            
        }      
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException{
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException (String nomeDoArquivo, String diretorio){
        super("O arquivo " + nomeDoArquivo + " nao foi encontrado no diretorio "+ diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ImpossivelAberturaDeArquivoException {"+
                "nomeDoArquivo='"+nomeDoArquivo+ '\'' +
                ",diretorio =" +diretorio+ '\'' +
                '}';
    }
}
