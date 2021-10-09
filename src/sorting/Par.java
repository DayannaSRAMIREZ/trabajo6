package sorting;

import java.util.ArrayList;
import java.util.List;

public class Par implements Ordenable {
    /*
Crear una interfaz sorting.Ordenable que incluya la(s) operacion(es) necesaria(s) para
 poder realizar el sorting y modificar la función para que tome una lista de sorting.Ordenable
  y aplique el algoritmo. Verificar con varias clases.

Ejemplo de clases:

•	Una clase sorting.Par con dos números. Ordena por el primer número y si es igual, ordena por el segundo.
•	Cambiar la clase sorting.Par para que ordene por la suma de los dos números.
•	Una clase sorting.Persona con dni y sexo. Si el dni es igual y el sexo es distinto, la mujer debe aparecer primero.
 */

    int numeroA;
    int numeroB;

    public Par(int numeroA, int numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }

    public List<Par> casteoNuevaLista(List<Ordenable> miLista) {
        List<Par> parlist = new ArrayList<>();
        for (Ordenable elemento : miLista) {
            parlist.add((Par) elemento);
        }
        return parlist;
    }

    public List<Ordenable> ordenar(List<Ordenable> miLista) {
        List<Par> nuevaLista = casteoNuevaLista(miLista);
        int contador = 0;
        while (contador <= nuevaLista.size() + 1) {
            contador++;
            for (int i = 0; i < nuevaLista.size() - 1; i++) {
                boolean cambiado = false;
                if (cambio(nuevaLista.get(i), nuevaLista.get(i + 1))) {
                    Par temporal = nuevaLista.get(i);
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

    public Boolean cambio(Object objeto1, Object objeto2) {
        Par par1copia = (Par) objeto1;
        Par par2copia = (Par) objeto2;

        if (par1copia.numeroA > par2copia.numeroA) return true;
        if (par1copia.numeroA == par2copia.numeroA) {
            if (par1copia.numeroB > par2copia.numeroB) return true;
            else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Par{");
        sb.append("numeroA=").append(numeroA);
        sb.append(", numeroB=").append(numeroB);
        sb.append('}');
        return sb.toString();
    }
}
