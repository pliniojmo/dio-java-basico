package aula03;

public class Contato {
    private String nome;
    private Integer numero;

    public Contato (String nome,Integer numero){
        this.nome=nome;
        this.numero=numero;

    }

    public String getNome() {
        return nome;
    }
    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{" +
                "nome= '"+ nome + '\'' +
                ", numero= " + numero +'\'' +
                '}';
    }
}
