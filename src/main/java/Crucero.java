public class Crucero {
    private String id;
    private String destino;

    public Crucero(String id, String destino) {
        this.id = id;
        this.destino = destino;
    }

    public String getID(){

        return this.id;

    }

    public void setID(String id){

        this.id = id;

    }

    public String getdestino(){

        return this.destino;

    }

    public void setDestino(String destino){

        this.destino = destino;

    }
}