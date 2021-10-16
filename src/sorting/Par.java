package sorting;

public class Par implements Ordenable {
    int numeroA;
    int numeroB;

    public Par(int numeroA, int numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }
    @Override
    public Boolean esMayor(Object objeto) {
        Par par1copia = (Par) objeto;

        if (this.numeroA > par1copia.numeroA) return true;
        if (this.numeroA == par1copia.numeroA) {
            if (this.numeroB > par1copia.numeroB) return true;
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
