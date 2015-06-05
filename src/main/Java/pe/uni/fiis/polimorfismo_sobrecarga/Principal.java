package pe.uni.fiis.polimorfismo_sobrecarga;

/**
 * Created by User on 05/06/2015.
 */
public class Principal {
    public static void main(String[] args) {
        Numero num=new Numero();
        num.set(10);
        System.out.println("El valor de los atributos son:  num1= "+ num.getNum1()+" "+"num2= "+num.getNum2());
        num.set(5.5);
        System.out.println("El valor de los atributos son:  num1= "+ num.getNum1()+" "+"num2= "+num.getNum2());
        num.set(20,1500.25);
        System.out.println("El valor de los atributos son:  num1= "+ num.getNum1()+" "+"num2= "+num.getNum2());
        //num.set(1500.25,20);
        //System.out.println("El valor de los atributos son:  num1= "+ num.getNum1()+" "+"num2= "+num.getNum2());
        //DA ERROR DEBIDO A QUE NO CUMPLE EL ORDEN DE LOS PARÁMETROS
    }
}
