package animales;

import vehiculo.Volador;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() {
        return nombre;
    }

    public abstract void describir();

    public static List<Animal> dameAcuaticos(List<Animal> lista) {
        List<Animal> acuaticosList = new ArrayList<>();
        lista.forEach(animal -> {
            if (animal instanceof Acuatico) {
                acuaticosList.add(animal);
            }
        });
        return acuaticosList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void imprimirLista(List<Animal> animales) {
        animales.forEach(animal -> System.out.println(animal));
    }

    public static void showDeAnimales(List<Animal> animalList) {
        animalList.forEach(animal -> {
            if (animal instanceof Acuatico) ((Acuatico) animal).nadar();
            else if (animal instanceof Volador) ((Volador) animal).volar();
            else System.out.println("este animal no hace nada");

        });

    }
}
