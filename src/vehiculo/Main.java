package vehiculo;


public class Main {
    public static void main(String[] args) {
        Lancha lancha1 = new Lancha();
        Auto auto1 = new Auto();
        Helicoptero helicoptero1 = new Helicoptero();
        Avion avion1 = new Avion();

        Vehiculo vehiculo1 = lancha1;
        vehiculo1 = auto1;
        //vehiculo1 = helicoptero1;
        //vehiculo1 = avion1;

        Vehiculo.hacerVolar(vehiculo1);

       /* if (vehiculo1 instanceof Vehiculo.Volador) {
            Vehiculo.Volador volador1 = (Vehiculo.Volador) vehiculo1;
        } else System.out.println("No se puede castear");*/
    }
}