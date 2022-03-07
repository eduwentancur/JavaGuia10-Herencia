
package ejercicio4.entidades;

import java.util.Date;


public class SailBoats extends Boat{
    
    private Integer numberMasts;

    public SailBoats() {
    }

    public SailBoats(Integer numberMasts, Integer enrollment, Integer boatSize, Date yearManufactured) {
        super(enrollment, boatSize, yearManufactured);
        this.numberMasts = numberMasts;
    }

    public Integer getNumberMasts() {
        return numberMasts;
    }

    public void setNumberMasts(Integer numberMasts) {
        this.numberMasts = numberMasts;
    }
    
    
    
    
    
    
}
