package tareas;
import java.util.List;

//-	Varias clases que se creen con una lista y ejecute operaciones sobre el array (inline).
public class Imprimir extends TareasBase implements Tarea {
    List<String> tipoDocumento;

    public Imprimir(List<String> tipoDocumento) {
        super("Imprimir");
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public void ejecutar() {
        System.out.println("Se esta ejecutando");

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public List<String> archivar() {
        int contador = 0;
        while (contador < tipoDocumento.size()) {
            for (String elemento : tipoDocumento) {
                tipoDocumento.set(contador, elemento + " Archivado");
                contador++;

            }
        }
        return tipoDocumento;
    }

}
