import java.util.ArrayList;

public abstract class Cabina {
    protected String estado;
    protected ArrayList<Politica> condiciones;
    protected float precio;

    public Cabina(String estado, float precio) {
        this.estado = estado;
        this.precio = precio;
        this.condiciones = new ArrayList<>();
    }

    public void agregarCondicion(Politica politica) {
        condiciones.add(politica);
    }
}
