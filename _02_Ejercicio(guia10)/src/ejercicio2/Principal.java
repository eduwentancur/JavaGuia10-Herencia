

package ejercicio2;


import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;


public class Principal {

    
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        System.out.println(lavadora.toString());
        Televisor tv = new Televisor();
        tv.crearTelevisor();
        System.out.println(tv.toString());
        
    }

}
