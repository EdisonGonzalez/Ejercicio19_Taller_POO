package slntaller_poo;

import java.util.Scanner;

public class Ejercicio19 {
    
 /*
Diseñar una jerarquía de clases: Círculo, Cilindro y CilindroHueco. En esencia, se puede decir
que un objeto cilindro es un objeto círculo con una altura, y un cilindro hueco es un cilindro
con un espacio huevo dentro de él. La clase Círculo debe tener un dato Radio (tipo double) y
unas funciones miembro LeerRadio, Area y Circunferencia, que obtienen el valor del radio y
calculan el área del círculo y la longitud de la circunferencia. Escribir un programa que
permita crear objetos Circulo, Cilindro y CilindroHueco y calcule la longitud de la
circunferencia y las áreas del círculo, del cilindro y del cilindro hueco.
*/        
        
    public static void main(String[] args) {
       
       //Declaración de miembros
       Scanner LECTOR = new Scanner(System.in);
       int sel, dec;
       double radiocir, radiocil, h, longcir; //, radiocil_h;
        
       //Creando Interfaz de Interacción con el usuario
        System.out.println("Bienvenido al programa en el cual usted podrá elegir"
                + " si desea diseñar un circulo y un cilindro (ya sea hueco o compacto)."
                + "\n\nLas opciones son las siguientes:"
                + "\n\n1. Elegir circulo. (Obtendra el área del círculo y la longitud "
                + "de la circunferencia)."
                + "\n2. Elegir cilindro compacto. (Obtendra su area y volumen)."
                + "\n3. Elegir cilindro hueco. (Obtendra su longitud y volumen)."
                + "\n\nPor favor ingrese el un número según su necesidad:");
        sel=LECTOR.nextInt();
        
        //Lógica de instrucciones según decisión
        switch (sel){
            case 1:{
                Circulo cir = new Circulo();
                System.out.println("\nIngrese ahora el radio del circulo: ");
                radiocir=LECTOR.nextDouble();
                cir.setRadio(radiocir);
                System.out.println("\nEl radio ingresado es: "+cir.getRadio()
                        +". Si desea cambiarlo ingrese el numero 1, sino ingrese "
                        + "el numero cero");
                dec=LECTOR.nextInt();
                if (dec==1){
                    System.out.println("\nIngrese ahora el nuevo radio del circulo: ");
                    radiocir=LECTOR.nextDouble();
                    cir.setRadio(radiocir);
                    System.out.println("\nEl radio ingresado es: "+cir.getRadio());
                    System.out.println("\nEl area del circulo es: "+cir.Area()
                            +" y la longitud de la circunferencia es: "+cir.Longitud());
                }else{
                    System.out.println("\nEl radio ingresado es: "+cir.getRadio());
                    System.out.println("\nEl area del circulo es: "+cir.Area()
                            +" y la longitud de la circunferencia es: "+cir.Longitud());
                }
            }
            case 2:{
                Cilindro cil = new Cilindro();
                System.out.println("\nIngrese ahora el radio del cilindro macizo: ");
                radiocil=LECTOR.nextDouble();
                cil.setRadio(radiocil);
                System.out.println("\nEl radio ingresado es: "+cil.getRadio()
                        +". Si desea cambiarlo ingrese el numero 1, sino ingrese "
                        + "el numero cero");
                dec=LECTOR.nextInt();
                if (dec==1){
                    System.out.println("\nIngrese ahora el nuevo radio del cilindro macizo: ");
                    radiocil=LECTOR.nextDouble();
                    cil.setRadio(radiocil);
                    System.out.println("\nEl radio ingresado es: "+cil.getRadio()+"."+
                            "\nAhora ingrese la altura del cilindro");
                    h=LECTOR.nextDouble();
                    cil.SetAltura(h);
                    System.out.println("\nEl area del cilindro es: "+cil.AreaC()
                            +" y el volumen del cilindro es: "+cil.VolumenC());
                }else{
                    System.out.println("\nEl radio ingresado es: "+cil.getRadio()+"."+
                            "\nAhora ingrese la altura del cilindro");
                    h=LECTOR.nextDouble();
                    cil.SetAltura(h);
                    System.out.println("\nEl area del cilindro es: "+cil.AreaC()
                            +" y el volumen del cilindro es: "+cil.VolumenC());
                }
            case  3:{
                
            }   
            }
        }
    }
    
}
