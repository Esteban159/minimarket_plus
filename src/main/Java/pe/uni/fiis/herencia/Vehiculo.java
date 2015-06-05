package pe.uni.fiis.herencia;

/**
 * Created by User on 04/06/2015.
 */
public abstract class Vehiculo {
    public  String color;
    private Integer cv;
    private final Integer ruedas;
    private Integer velocidad;
    public  Vehiculo(String color, Integer cv, Integer ruedas, Integer velocidad) {
        this.color = color;
        this.cv = cv;
        this.ruedas = ruedas;
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
    public void frenar(){
        this.velocidad=0;
    }
    public abstract void acelerar();
}
