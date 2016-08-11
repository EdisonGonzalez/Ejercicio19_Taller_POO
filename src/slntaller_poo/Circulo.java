package slntaller_poo;

//Declaración de la clase
public class Circulo {
    
    //Variables de instancia
    private double radio;
    
    //Metodos
    public double Area(){
        return (Math.PI*Math.pow(radio, 2));
    }
    
    public double Longitud(){
        return (2*Math.PI*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}

