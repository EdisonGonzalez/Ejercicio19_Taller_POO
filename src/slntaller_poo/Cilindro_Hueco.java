package slntaller_poo;

//Declaración de la clase Cilindro_Hueco que Hereda de la clase Cilindro
public class Cilindro_Hueco extends Cilindro{
    
    //Variables de instancia
    private double radio2;
    
    //Metodos
            
    public double getRadio2() {
        return radio2;
    }
    
    public void setRadio2(double radio2){
        this.radio2=radio2;
    }
    
    public double Longitud_C_H(){
        return (((2*Math.PI)*((Math.pow(this.getRadio2(),2))-(Math.pow(this.getRadio(),2))))
                +(2*Math.PI*this.getAltura()*radio2)+(2*Math.PI*this.getAltura()*this.getRadio()));
    }
    
    public double Volumen_C_H(){
        return (Math.PI*((Math.pow(this.getRadio2(),2))-(Math.pow(this.getRadio(),2)))*(this.getAltura()));
    }
}
