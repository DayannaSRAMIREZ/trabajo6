package animales;

import vehiculo.Volador;

public class Aguila extends Animal implements Volador {
    public Aguila(String nombre) {
        super(nombre);
    }

    @Override
    public void describir() {
        System.out.println("Soy el aguila: " + nombre);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " esta volando.");

    }

}
