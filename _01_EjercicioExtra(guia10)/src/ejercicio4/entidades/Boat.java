
package ejercicio4.entidades;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Boat {
    protected Integer enrollment;
    protected Integer boatSize;
    protected Date yearManufactured;

    public Boat() {
    }

    public Boat(Integer enrollment, Integer boatSize, Date yearManufactured) {
        this.enrollment = enrollment;
        this.boatSize = boatSize;
        this.yearManufactured = yearManufactured;
    }

    public Integer getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Integer enrollment) {
        this.enrollment = enrollment;
    }

    public Integer getBoatSize() {
        return boatSize;
    }

    public void setBoatSize(Integer boatSize) {
        this.boatSize = boatSize;
    }

    public Date getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(Date yearManufactured) {
        this.yearManufactured = yearManufactured;
    }
    
    public Boat crearBarco(){
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opcion=0;
        Boat boat = new Boat();
        System.out.println("Ingrese ahora su matricula del BARCO");
        this.enrollment = teclado.nextInt();
        System.out.println("Ingrese la eslora en metros");
        this.boatSize=teclado.nextInt();
        System.out.println("Ingrese año de fabricacion del barco AAAA/MM/DD");
        this.yearManufactured = new Date(teclado.nextInt()+1900,teclado.nextInt(),teclado.nextInt());
        do {
            System.out.println("INGRESE POR LA OPCION QUE DESEA");
            System.out.println("1-Numero de mastiles para veleros 2-Potencia en motor 3- Potencia y numero de camarotes de yates");
            opcion=teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese numero de mastiles");
                    SailBoats numberSail = new SailBoats();
                    numberSail.setNumberMasts(teclado.nextInt());
                    return boat;
                case 2:
                    System.out.println("Ingrese la potencia del motor");
                    MotorBoat motorBarco = new MotorBoat();
                    motorBarco.setPower(teclado.nextInt());
                    return boat;
                case 3:
                    System.out.println("Ingrese potencia del motor");
                    CabinsYachts powerCabins = new CabinsYachts();
                    powerCabins.setPowerCV(teclado.nextInt());
                    return boat;
                default:
                    System.out.println("Ingreso opcion incorrecta");
            }
        } while (opcion !=3);
        return boat;
    }
}
