
package ejercicio4.entidades;

import java.util.Date;


public class CabinsYachts extends Boat {
    
    private Integer powerCV;
    private Integer numberCabinsForYachts;

    public CabinsYachts() {
    }

    public CabinsYachts(Integer power, Integer numberCabinsForYachts, Integer enrollment, Integer boatSize, Date yearManufactured) {
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
    
    
    
    
    
    
}
