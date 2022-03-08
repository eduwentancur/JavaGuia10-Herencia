
package ejercicio1Extra;

import ejercicio1Extra.entidades.Rental;

public class Principal {
    
    public static void main(String[] args) {
        Rental rental = new Rental();
        rental.rentalClient();
        System.out.println(rental.toString());
        rental.priceRental();
    }
}
