package slntaller_poo;

//Declaración de la clase Cilindro que Hereda de la clase Circulo
public class Cilindro extends Circulo {
    
    //Variables de instancia (Por buenas prácticas, las variables privadas y los
    //metodos publicos)
    private double altura;
    
    //Metodos (Los miembros se dividen en dos: variables y metodos)
    public double getAltura() {
        return altura;
    }
    public void SetAltura(double h){
        altura=h;
    }
    
    public double AreaC(){
        return (2*Math.PI*this.getRadio()*altura);
    }
    
    public double VolumenC(){
        return (Math.PI*altura*this.getRadio());
    }
   
}
