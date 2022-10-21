import classes.Carro;

public class ExecCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setCor("Azul");
        carro.setModelo("BMW");
        carro.setCapacidadeTanque(59);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(6.39));

        Carro carro2 = new Carro("Fusca","Branco",35);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.45));

    }
}
