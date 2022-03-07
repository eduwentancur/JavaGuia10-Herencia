
package ejercicio4.entidades;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Rental {
    private String clientName;
    private Integer DNI;
    private Date rentalDate;
    private Date returnDate;
    private Integer mooringPosition;
    private Boat boat;
    private Scanner teclado;

    public Rental() {
    }

    public Rental(String clientName, Integer DNI, Date rentalDate, Date returnDate, Integer mooringPosition, Boat boat) {
        this.clientName = clientName;
        this.DNI = DNI;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.mooringPosition = mooringPosition;
        this.boat = boat;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getMooringPosition() {
        return mooringPosition;
    }

    public void setMooringPosition(Integer mooringPosition) {
        this.mooringPosition = mooringPosition;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }
    
    public void crearAlquiler(){
        Boat boat = new Boat();
        this.teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese su nombre");
        this.clientName=teclado.next();
        System.out.println("Ingrese numero de documento");
        this.DNI = teclado.nextInt();
        System.out.println("La fecha para aquilar es la actual");
        this.rentalDate = new Date();
        System.out.println("Ingrese la fecha de devolucion AAAA/MM/DD");
        this.returnDate = new Date(teclado.nextInt()+1900,teclado.nextInt(),teclado.nextInt());
        System.out.println("Ingrese la posicion del amarre");
        this.mooringPosition = teclado.nextInt();
        this.boat= boat.crearBarco();
        
        
    
    }
    
    
    
    
}
