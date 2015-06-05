package pe.uni.fiis.polimorfismo_sobrecarga;

/**
 * Created by User on 05/06/2015.
 */
public class Numero {
    private Integer num1=0;
    private Double num2=0.0;

    public void set(Integer num1){
        this.num1=num1;
    }
    public void set(Double num2){
        this.num2=num2;
    }
    public Integer getNum1(){
        return this.num1;
    }
    public Double getNum2(){
        return this.num2;
    }
    public void set(Integer num1, Double num2){
        this.num1=num1;
        this.num2=num2;
    }
}
