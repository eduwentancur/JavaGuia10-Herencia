
package ejercicio4.entidades;

import java.util.Date;


public class MotorBoat extends Boat {
    
    private Integer power;

    public MotorBoat() {
    }

    public MotorBoat(Integer power, Integer enrollment, Integer boatSize, Date yearManufactured) {
        super(enrollment, boatSize, yearManufactured);
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    

    
    
    
    
    
    
    
}
