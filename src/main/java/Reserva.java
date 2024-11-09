public class Reserva {
    private Usuario usuario;
    private Cabina cabina;
    private Servicio servicio;
    private String fecha;
    private boolean estado;

    public Reserva(Usuario usuario, Cabina cabina, Servicio servicio, String fecha) {
        this.usuario = usuario;
        this.cabina = cabina;
        this.servicio = servicio;
        this.fecha = fecha;
        this.estado = true; // Activas por defecto
    }

    // Getters y Setters
}


