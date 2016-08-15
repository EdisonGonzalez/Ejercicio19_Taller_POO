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
       double radiocir, radiocil, h, radiocil_i_h, radiocil_e_h;
        
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
                        +". Si desea cambiarlo ingrese el numero 1 (uno), sino ingrese "
                        + "el numero 0 (cero)");
                dec=LECTOR.nextInt();
                if (dec==1){
                    System.out.println("\nIngrese ahora el nuevo radio del circulo: ");
                    radiocir=LECTOR.nextDouble();
                    cir.setRadio(radiocir);
                    System.out.println("\nEl radio ingresado es: "+cir.getRadio());
                    System.out.println("\nEl area del circulo es: "+cir.Area()
                            +" y la longitud de la circunferencia es: "+cir.Longitud());
                }else{
                    System.out.println("\nEl area del circulo es: "+cir.Area()
                            +" y la longitud de la circunferencia es: "+cir.Longitud());
                }
            break;
            }
            case 2:{
                Cilindro cil = new Cilindro();
                System.out.println("\nIngrese ahora el radio del cilindro macizo: ");
                radiocil=LECTOR.nextDouble();
                cil.setRadio(radiocil);
                System.out.println("\nIngrese ahora la altura del cilindro macizo: ");
                h=LECTOR.nextDouble();
                cil.SetAltura(h);
                System.out.println("\nEl radio ingresado es: "+cil.getRadio()+" y su altura es: "+cil.getAltura()
                        +". Si desea cambiar dichos valores ingrese el numero 1 (uno), sino ingrese "
                        + "el numero 0 (cero)");
                dec=LECTOR.nextInt();
                if (dec==1){
                    System.out.println("\nIngrese ahora el radio del cilindro macizo: ");
                    radiocil=LECTOR.nextDouble();
                    cil.setRadio(radiocil);
                    System.out.println("\nIngrese ahora la altura del cilindro macizo: ");
                    h=LECTOR.nextDouble();
                    cil.SetAltura(h);
                    System.out.println("\nEl radio y altura ingresada son respectivamente: "
                            +cil.getRadio()+", "+cil.getAltura()+"\nEl area del cilindro es: "+cil.AreaC()
                            +" y el volumen del cilindro es: "+cil.VolumenC());
                }else{
                    System.out.println("\nEl area del cilindro es: "+cil.AreaC()
                            +" y el volumen del cilindro es: "+cil.VolumenC());
                }
            break;
            }
            case  3:{
                Cilindro_Hueco cil_h = new Cilindro_Hueco();
                System.out.println("\nIngrese ahora el radio interno del cilindro hueco: ");
                radiocil_i_h=LECTOR.nextDouble();
                cil_h.setRadio(radiocil_i_h);
                System.out.println("\nIngrese ahora el radio externo del cilindro hueco: ");
                radiocil_e_h=LECTOR.nextDouble();
                cil_h.setRadio2(radiocil_e_h);
                System.out.println("\nIngrese ahora la altura del cilindro hueco: ");
                h=LECTOR.nextDouble();
                cil_h.SetAltura(h);
                System.out.println("\nEl radio interno, el radio externo y la altura "
                        + "que fueron ingresados son respectivamente: "+cil_h.getRadio()+
                        ", "+cil_h.getRadio2()+" y "+cil_h.getAltura()+". Si desea cambiar dichos"
                        + " valores ingrese el numero 1 (uno), sino ingrese el numero 0 (cero)");
                dec=LECTOR.nextInt();
                if (dec==1){
                    System.out.println("\nIngrese ahora el radio interno del cilindro hueco: ");
                    radiocil_i_h=LECTOR.nextDouble();
                    cil_h.setRadio(radiocil_i_h);
                    System.out.println("\nIngrese ahora el radio externo del cilindro hueco: ");
                    radiocil_e_h=LECTOR.nextDouble();
                    cil_h.setRadio2(radiocil_e_h);
                    System.out.println("\nIngrese ahora la altura del cilindro hueco: ");
                    h=LECTOR.nextDouble();
                    cil_h.SetAltura(h);
                    System.out.println("\nEl radio interno, el radio externo y la altura "
                        + "que fueron ingresados son respectivamente: "+cil_h.getRadio()+
                        ", "+cil_h.getRadio2()+" y "+cil_h.getAltura()+". Su longitud y volumen son"
                            + " respectivamente: "+cil_h.Longitud_C_H()+" y "+cil_h.Volumen_C_H());
                }else{
                    System.out.println("\nSu longitud y volumen son respectivamente: "
                            +cil_h.Longitud_C_H()+" y "+cil_h.Volumen_C_H());
                }
            break;
            }
            default:System.out.println("El valor ingresado no es válido");break;
        }
    }
    
}
