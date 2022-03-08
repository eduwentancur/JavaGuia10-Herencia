
package ejercicio1Extra.entidades;

import java.time.LocalDate;

public class MotorBoat extends Boat {
    
    private Integer power;
    

    public MotorBoat() {
    }

    public MotorBoat(Integer power, Integer enrollment, Integer boatSize, LocalDate yearManufactured) {
        super(enrollment, boatSize, yearManufactured);
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("%s tiene de potencia de %s ", super.toString(),this.power);
    }
    
}
