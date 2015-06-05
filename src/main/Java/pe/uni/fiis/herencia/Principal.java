package pe.uni.fiis.herencia;

/**
 * Created by User on 04/06/2015.
 */
public class Principal {
    public static void main(String[] args) {
        Vehiculo []medios=new Vehiculo[4];
        medios[0]=new Coche("rojo",100,4,20,4);
        medios[1]=new Coche("azul",150,4,100,2);
        medios[2]=new Moto("negro",200,2,30,false);
        medios[3]=new Moto("verde",100,4,20,true);
        for(Vehiculo e:medios){
            e.acelerar();
            System.out.println(e.getVelocidad());
        }
    }
}
