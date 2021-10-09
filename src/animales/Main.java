package animales;

import java.util.ArrayList;
import java.util.List;

/*


Hacer una función showDeAnimales(animales) que toma una lista de Animal y a todos los
Acuatico los hace nadar, a todos los Volador los hace volar y al resto imprime “NOMBRE no hace nada”
*/
public class Main {
    public static void main(String[] args) {

        Paloma paloma1= new Paloma("Maria");
        Aguila aguila1= new Aguila("Lucerna");
        Leon leon1= new Leon("Simba");
        Hiena hiena1= new Hiena("Siera");
        Pez pez1= new Pez("Nemo");
        Ballena ballena1= new Ballena("Moly");
        List<Animal> animalList= new ArrayList<>();
        animalList.add(paloma1);
        animalList.add(aguila1);
        animalList.add(hiena1);
        animalList.add(pez1);
        animalList.add(ballena1);
        animalList.add(leon1);
        Animal.showDeAnimales(Animal.dameAcuaticos(animalList));



    }
}
