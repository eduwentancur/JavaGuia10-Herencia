package ejercicio1Extra.entidades;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Boat {

    protected Integer enrollment;
    protected Integer boatSize;
    protected LocalDate yearManufactured;
    private Scanner teclado;

    public Boat() {
        this.teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public Boat(Integer enrollment, Integer boatSize, LocalDate yearManufactured) {
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

    public LocalDate getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(LocalDate yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public Boat createBoat() {
        int opcion = 0;
        System.out.println("Ingrese ahora su matricula del BARCO");
        this.enrollment = teclado.nextInt();
        System.out.println("Ingrese la eslora en metros");
        this.boatSize = teclado.nextInt();
        System.out.println("Ingrese año de fabricacion del barco AÑO|MES|DIA en ese orden");
        this.yearManufactured = LocalDate.of(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
        do {
            System.out.println("INGRESE LA OPCION QUE DESEA");
            System.out.println("1- Para veleros 2- Potencia en motor 3- Para yate");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    return typeSailboat();
                case 2:
                    return typePower();
                case 3:
                    return typePowerYate();
                default:
                    System.out.println("Ingreso opcion incorrecta");
            }
        } while (true);
    }

    public Boat typeSailboat() {
        System.out.println("Ingrese numero de mastiles");
        int numberMastil = teclado.nextInt();
        SailBoat numberSail = new SailBoat(numberMastil, this.enrollment, this.boatSize, this.yearManufactured);
        return numberSail;
    }

    public Boat typePower() {
        System.out.println("Ingrese la potencia del motor");
        MotorBoat motorBarco = new MotorBoat(teclado.nextInt(), this.enrollment, this.boatSize, this.yearManufactured);
        return motorBarco;
    }

    public Boat typePowerYate() {
        System.out.println("Ingrese potencia del motor");
        int power = teclado.nextInt();
        System.out.println("Ingrese el numero de camarotes");
        int numberCamarote = teclado.nextInt();
        CabinYacht powerCabins = new CabinYacht(power, numberCamarote, this.enrollment, this.boatSize, this.yearManufactured);
        return powerCabins;
    }

    @Override
    public String toString() {
        return String.format("****BARCO****\n Matricula: %s Tamaño: %s metros Fabricado: %s ",this.enrollment,this.boatSize,this.yearManufactured);
    }
}
