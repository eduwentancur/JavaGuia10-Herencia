
package ejercicio4.entidades;

import ejercicio4.interfaces.calculationsFigures;

public class Rectangle implements calculationsFigures {
   
    private double base;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public void calculateArea() {
        double area = base*height;
        System.out.printf("El area del rectangulo es: %.2f\n", area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = (base+height)*2;
        System.out.printf("El perimetro del rectangulo es %.2f\n", perimeter);
    }
}
