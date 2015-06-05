package pe.uni.fiis.herencia;

/**
 * Created by User on 04/06/2015.
 */
public class Coche extends Vehiculo{
    private Integer puertas;

    public Coche(String color, Integer cv, Integer ruedas, Integer velocidad, Integer puertas) {
        super(color, cv, ruedas, velocidad);
        this.puertas = puertas;
    }

    public void acelerar(){
        super.setVelocidad(getVelocidad()+10);//En la Clase Coche
    }

}
