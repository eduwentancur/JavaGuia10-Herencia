
package ejercicio1;

import ejercicio1.entidades.*;

public class Principal {
    
    public static void main(String[] args) {
        Animal perro = new Perro("Stich","Carnivoro",15,"Doberman");
        perro.Alimentarse();
        Animal gato = new Gato("Teddy","Croquetas",10,"Chihuahua");
        gato.Alimentarse();
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.Alimentarse();
    }

}
