import java.util.ArrayList;
import java.util.List;

public class Busqueda implements BusquedaPorDuracion,BusquedaPorDestino,BusquedaPorPolitica {
    protected ArrayList<Crucero> cruceros;

    public List<Crucero> buscarGeneral() {
        // Lógica de búsqueda general
        return new List<Crucero>();
    }

    public List<Crucero> buscarPorDestino(String destino){

        //logica de BusquedaPorDestino

        return new List<Crucero>();
    }

    public List<Crucero> buscarPorDuracion(int dias){

        //logica de BusquedaPorDuracion

        return new List<Crucero>();
    }

    public List<Crucero> buscarPorPolitica(String nombrePolitica){

        //logica de BusquedaPorPolitica

        return new List<Crucero>();
    }
}
