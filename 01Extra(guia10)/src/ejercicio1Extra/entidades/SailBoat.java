
package ejercicio1Extra.entidades;

import java.time.LocalDate;

public class SailBoat extends Boat{
    
    private Integer numberMasts;
    
    public SailBoat() {
    }

    public SailBoat(Integer numberMasts, Integer enrollment, Integer boatSize, LocalDate yearManufactured) {
        super(enrollment, boatSize, yearManufactured);
        this.numberMasts = numberMasts;
    }

    public Integer getNumberMasts() {
        return numberMasts;
    }

    public void setNumberMasts(Integer numberMasts) {
        this.numberMasts = numberMasts;
    }

    @Override
    public String toString() {
        return String.format("%stiene %s matiles para velero", super.toString(),this.numberMasts);
    }
}
