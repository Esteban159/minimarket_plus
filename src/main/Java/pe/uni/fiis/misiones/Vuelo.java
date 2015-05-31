package pe.uni.fiis.misiones;

/**
 * Created by User on 31/05/2015.
 */
public class Vuelo {
    private String origen;
    private String destino;
    private String hora_partida;
    private String aerolinea;
    private String hora_llegada;
    private String id_vuelo;

    public String getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(String id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public Vuelo(String origen,String destino,String hora_partida,String hora_llegada,String aerolinea,String id_vuelo ){
        this.setAerolinea(aerolinea);
        this.setDestino(destino);
        this.setHora_llegada(hora_llegada);
        this.setOrigen(origen);
        this.setHora_partida(hora_partida);
        this.setId_vuelo(id_vuelo);

    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora_partida() {
        return hora_partida;
    }

    public void setHora_partida(String hora_partida) {
        this.hora_partida = hora_partida;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }
}
