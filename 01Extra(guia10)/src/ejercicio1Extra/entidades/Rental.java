
package ejercicio1Extra.entidades;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Locale;
import java.util.Scanner;

public class Rental {
    
    private String clientName;
    private Integer DNI;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private Integer mooringPosition;
    private Boat boat;
    private Scanner teclado;

    public Rental() {
    }

    public Rental(String clientName, Integer DNI, LocalDate rentalDate, LocalDate returnDate, Integer mooringPosition, Boat boat) {
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

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
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
    
    public void rentalClient(){
        this.teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese su nombre");
        this.clientName=teclado.next();
        System.out.println("Ingrese numero de documento");
        this.DNI = teclado.nextInt();
        System.out.println("La fecha para aquilar es la actual");
        this.rentalDate=LocalDate.now();
        System.out.println("Fecha de devolucion AAAA/MM/DD");
        System.out.println("Ingrese el año de devolucion ");
        int año=teclado.nextInt();
        System.out.println("Ingrese mes de devolucion");
        int mes=teclado.nextInt();
        System.out.println("Ingrese dia de devolucion");
        int dia = teclado.nextInt();
        this.returnDate = LocalDate.of(año,mes,dia);
        System.out.println("Ingrese posicion de amarre");
        this.mooringPosition = teclado.nextInt();
        Boat barco = new Boat();
        this.boat=barco.createBoat();
    }
    
    public void priceRental(){
        double modulo=valueModulo();
        long days= calculateDays(this.rentalDate,this.returnDate);
        System.out.printf("EL PRECIO FINAL DEL ALQUILER ES %.2f \n", days*modulo);
    }
    
    public double valueModulo(){
        return this.boat.boatSize*10;
    }
    
    public long calculateDays(LocalDate start, LocalDate finish){
        return DAYS.between(start, finish);
    }
    
    @Override
    public String toString() {
        return String.format("***ALQUILER***\n El cliente %s con DNI: %s \n Fecha del alquiler : %s | Fecha de devolucion: %s\n %s\n ",this.clientName,this.DNI,this.rentalDate,this.returnDate,this.boat);
    }
}
