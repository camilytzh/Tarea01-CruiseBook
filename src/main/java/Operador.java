public class Operador extends Entidad {
    private List<Politica> politicas;
    private List<Condicion> condiciones;

    public Operador(int cedula, String nombre, int edad) {
        super(cedula, nombre, edad);
    }

    public void crearPolitica(String descripcion, Politica politica) {
        // Lógica 
    }
}
