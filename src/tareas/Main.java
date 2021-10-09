package tareas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombreDocs = new ArrayList<>();
        nombreDocs.add("DNI");
        nombreDocs.add("Cedula");
        Imprimir imprimir1 = new Imprimir(nombreDocs);
        Documentar documentar1 = new Documentar("documento 1");

        List<Tarea> tareaList = new ArrayList<>();
        tareaList.add(imprimir1);
        tareaList.add(documentar1);

       // procesarBatch(tareaList);

        List<String> otraLista = imprimir1.archivar();

        for (String elemento : otraLista) {
            System.out.println(elemento);
        }
    }

    static void procesarBatch(List<Tarea> tareasList) {

        for (Tarea tarea : tareasList) {
            System.out.println("La tarea a ejecutar es: " + tarea.getNombre());
            tarea.ejecutar();
        }
    }
}
