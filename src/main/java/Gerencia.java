public class Gerencia extends Entidad {
    private String telefono;

    public Gerencia(int cedula, String nombre, String telefono) {
        super(cedula, nombre, 0); 
        this.telefono = telefono;
    }

    public void procesarSolicitud() {
        // Lógica para procesar solicitud
    }
}
