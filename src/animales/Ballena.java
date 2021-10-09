package animales;

public class Ballena extends Animal implements Acuatico {
    public Ballena(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " esta nadando.");
    }

    @Override
    public void describir() {
        System.out.println("Soy la ballena: " + nombre);
    }
}
