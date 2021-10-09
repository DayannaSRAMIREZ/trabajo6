package animales;

import vehiculo.Volador;

public class Paloma extends Animal implements Volador {

    public Paloma(String nombre) {
        super(nombre);
    }

    @Override
    public void describir() {
        System.out.println("Soy la paloma: " + nombre);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " esta volando.");

    }
}
