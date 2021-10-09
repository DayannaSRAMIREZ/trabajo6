package vehiculo;

public abstract class Vehiculo {

    private static boolean esVolador(Vehiculo vehiculo1) {
        if (vehiculo1 instanceof Volador) return true;
        else return false;
    }

    public static void hacerVolar(Vehiculo vehiculo) {
        if (vehiculo instanceof Volador) {
            ((Volador) vehiculo).volar();
        } else System.out.println("Este vehiculo no vuela");
    }

}
