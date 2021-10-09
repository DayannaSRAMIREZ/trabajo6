package animales;

public class Pez extends Animal implements Acuatico {
    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " esta nando.");

    }

    @Override
    public void describir() {
        System.out.println("Soy el pez: " + nombre);

    }
}
