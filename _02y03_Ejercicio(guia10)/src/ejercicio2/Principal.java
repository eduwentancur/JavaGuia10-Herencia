/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
*/

package ejercicio2;

import ejercicio2.entidades.*;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
//        EJERCICIO 1:  

//        Lavadora lavadora = new Lavadora();
//        lavadora.crearLavadora();
//        System.out.println(lavadora.toString());
//        Televisor tv = new Televisor();
//        tv.crearTelevisor();
//        System.out.println(tv.toString());


//      EJERCICIO 2:  
        List<Electrodomestico> listaElectrodomestico = new ArrayList<>();
        listaElectrodomestico.add(new Lavadora(50d, 5000d,"Blanco", 'F', 50d));
        listaElectrodomestico.add(new Lavadora(93d, 2500d,"Rojo", 'A', 70d));
        listaElectrodomestico.add(new Televisor(1940d,true,2600d,"Negro", 'B', 6d ));
        listaElectrodomestico.add(new Televisor(8000d,true,2800d,"Negro", 'B', 3d ));
        
        double sumaTotal=0;
        
        for (Electrodomestico elec: listaElectrodomestico) {
            elec.precioFinal();
            if (elec instanceof Lavadora ) {
                System.out.println(elec.toString());
                sumaTotal+=elec.getPrecio();
            }
            if (elec instanceof Televisor) {
                System.out.println(elec.toString());
                sumaTotal+=elec.getPrecio();
            }
            
        }
        
        System.out.printf("LA SUMA TOTAL DE TODOS LOS ELECTRODOMESTICOS ES DE $%.2f\n", sumaTotal);
        
        
    }

}
