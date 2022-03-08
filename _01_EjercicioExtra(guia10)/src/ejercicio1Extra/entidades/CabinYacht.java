
package ejercicio1Extra.entidades;

import java.time.LocalDate;
import java.util.Scanner;



public class CabinYacht extends Boat {
    
    private Integer powerCV;
    private Integer numberCabinsForYachts;
    private Scanner teclado;
    
    public CabinYacht() {
    }

    public CabinYacht(Integer power, Integer numberCabinsForYachts, Integer enrollment, Integer boatSize, LocalDate yearManufactured) {
        super(enrollment, boatSize, yearManufactured);
        this.powerCV = power;
        this.numberCabinsForYachts = numberCabinsForYachts;
    }

    public Integer getPowerCV() {
        return powerCV;
    }

    public void setPowerCV(Integer power) {
        this.powerCV = power;
    }

    public Integer getNumberCabinsForYachts() {
        return numberCabinsForYachts;
    }

    public void setNumberCabinsForYachts(Integer numberCabinsForYachts) {
        this.numberCabinsForYachts = numberCabinsForYachts;
    }
    
    @Override
    public String toString() {
        return String.format("%s tiene de potencia %s y tiene %s camarotes para el yate", super.toString(),this.powerCV,this.numberCabinsForYachts);
    }
}
