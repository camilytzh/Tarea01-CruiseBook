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

public class ServicioTecnico extends Entidad {
    public ServicioTecnico(int cedula, String nombre, int edad) {
        super(cedula, nombre, edad);
    }

    public void procesarReporte() {
        // Lógica
    }
}

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
