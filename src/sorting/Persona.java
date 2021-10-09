package sorting;

import java.util.ArrayList;
import java.util.List;

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

    public List<Persona> casteoNuevaLista(List<Ordenable> miLista) {
        List<Persona> personaList = new ArrayList<>();
        for (Ordenable elemento : miLista) {
            personaList.add((Persona) elemento);
        }
        return personaList;
    }

    @Override
    public Boolean cambio(Object objeto1, Object objeto2) {
        Persona persona1copia = (Persona) objeto1;
        Persona persona2copia = (Persona) objeto2;

        if (persona1copia.dni > persona2copia.dni) {
            return true;
        } else if (persona1copia.dni == persona2copia.dni) {
            if (persona2copia.femenino) return true;
            else return false;
        } else if (persona1copia.dni < persona2copia.dni) {
            return false;

        }
        return false;
    }

    @Override
    public List<Ordenable> ordenar(List<Ordenable> miLista) {
        List<Persona> nuevaLista = casteoNuevaLista(miLista);
        int contador = 0;
        while (contador <= nuevaLista.size() + 1) {
            contador++;

            for (int i = 0; i < nuevaLista.size() - 1; i++) {
                boolean cambiado = false;
                if (cambio(nuevaLista.get(i), nuevaLista.get(i + 1))) {
                    Persona temporal = nuevaLista.get(i);
                    nuevaLista.set(i, nuevaLista.get(i + 1));
                    nuevaLista.set((i + 1), temporal);
                    cambiado = true;
                }
                if (cambiado) break;
            }

        }

        for (int i = 0; i < miLista.size(); i++) {
            miLista.set(i, nuevaLista.get(i));
        }
        return miLista;
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
}
