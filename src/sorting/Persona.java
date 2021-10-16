package sorting;;

public class Persona implements Ordenable {
    protected String nombre;
    protected int dni;
    protected String sexo;
    protected boolean femenino = false;


    public Persona(String nombre, int dni, String sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        if (sexo.equalsIgnoreCase("f")) {
            this.femenino = true;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", dni=").append(dni);
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Boolean esMayor(Object objeto) {
        Persona copia=(Persona) objeto;
        if (this.dni==copia.dni){
            return (copia.femenino);
        }
        return (this.dni>copia.dni);
    }
}