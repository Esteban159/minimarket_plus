package pe.uni.fiis.herencia;

public class Moto extends Vehiculo {
    private Boolean reparar_cadena;

    public Moto(String color, Integer cv, Integer ruedas, Integer velocidad, Boolean reparar_cadena) {
        super(color, cv, ruedas, velocidad);
        this.reparar_cadena = reparar_cadena;
    }
    public void acelerar(){
        setVelocidad(getVelocidad()+5);// En la clase Moto
    }
}
