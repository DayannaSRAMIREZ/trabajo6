package sorting;

import java.util.List;

public interface Ordenable {
    Boolean cambio(Object objeto1, Object objeto2);

    List<Ordenable> ordenar(List<Ordenable> miLista);
}


