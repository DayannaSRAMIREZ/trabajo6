package animales;

public class Hiena extends Animal {
    public Hiena(String nombre) {
        super(nombre);
    }

    @Override
    public void describir() {
        System.out.println("Soy la hiena: " + nombre);

    }
}
