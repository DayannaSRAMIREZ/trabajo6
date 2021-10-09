package tareas;
public class TareasBase {
    protected String nombre;
    protected static int contadorDeTareas = 0;

    public TareasBase(String nombre) {
        this.nombre = nombre;
        contadorDeTareas++;
    }


}
