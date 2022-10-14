package aula02;

public class Carro extends Veiculo {
    private String modelo;
    private String cor;
    private int capacidadeTanque;

    public Carro(){

    }

    public Carro(String modelo, String cor, int capacidadeTanque){
        this.modelo=modelo;
        this.cor=cor;
        this.capacidadeTanque=capacidadeTanque;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double totalValorTanque (double valorComb) {
        return capacidadeTanque * valorComb;
    }

}

