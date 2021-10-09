package sorting;

import java.util.ArrayList;
import java.util.List;

public class ParSuma implements Ordenable {

    int suma;

    public ParSuma(int numeroA, int numeroB) {
        this.suma = numeroA + numeroB;
    }

    public List<ParSuma> casteoNuevaLista(List<Ordenable> miLista) {
        List<ParSuma> parlist = new ArrayList<>();
        for (Ordenable elemento : miLista) {
            parlist.add((ParSuma) elemento);
        }
        return parlist;
    }

    @Override
    public List<Ordenable> ordenar(List<Ordenable> miLista) {
        List<ParSuma> nuevaLista = casteoNuevaLista(miLista);
        int contador = 0;
        while (contador <= nuevaLista.size() + 1) {
            contador++;
            for (int i = 0; i < nuevaLista.size() - 1; i++) {
                boolean cambiado = false;

                if (cambio(nuevaLista.get(i), nuevaLista.get(i + 1))) {
                    ParSuma temporal = nuevaLista.get(i);
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
    public Boolean cambio(Object objeto1, Object objeto2) {
        ParSuma par1copia = (ParSuma) objeto1;
        ParSuma par2copia = (ParSuma) objeto2;

        if (par1copia.suma > par2copia.suma) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParSuma{");
        sb.append("suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}


