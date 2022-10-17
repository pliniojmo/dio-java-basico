package aula03;

public class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato (String nome, Integer idade, String cor){
        this.nome=nome;
        this.idade=idade;
        this.cor=cor;
    }

    public String getNome() {
        return nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public String getCor() {
        return cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome= '"+ nome + '\'' +
                ", idade= " + idade +
                ", cor= '"+ cor + '\'' +
                '}';
    }
    @Override
    public int compareTo (Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
