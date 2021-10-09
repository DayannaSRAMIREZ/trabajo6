package vehiculo;

public class Helicoptero extends Vehiculo implements Volador{
    @Override
    public void volar() {
        System.out.println("Vehiculo.Helicoptero volando");
    }
}
