package animales;

public class Leon extends Animal {
    public Leon(String nombre) {
        super(nombre);
    }

    @Override
    public void describir() {
        System.out.println("Soy el leon: " + nombre);

    }
}
