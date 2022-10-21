package classes;

public class SmartTv {
    public boolean ligada=false;
    private int canal=1;
    private int volume=25;

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void ligar (){
        ligada=true;
    }

    public void desligar (){
        ligada=true;
    }

    public void aumentarVolume(){
        setVolume(volume++);
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal++;
    }

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }

}
