package sorting;

import java.util.ArrayList;
import java.util.List;

public class ParSuma implements Ordenable {

    int suma;

    public ParSuma(int numeroA, int numeroB) {
        this.suma = numeroA + numeroB;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParSuma{");
        sb.append("suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Boolean esMayor(Object objeto) {
        ParSuma o = (ParSuma) objeto;
        return (this.suma > o.suma);
    }
}


