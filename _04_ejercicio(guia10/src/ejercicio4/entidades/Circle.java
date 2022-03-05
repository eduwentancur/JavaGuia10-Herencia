
package ejercicio4.entidades;

import ejercicio4.interfaces.calculationsFigures;

public class Circle implements calculationsFigures {
    private double radio;
    private double diameter;

    public Circle() {
    }

    public Circle(double radio, double diameter) {
        this.radio = radio;
        this.diameter = diameter;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    @Override
    public void calculateArea() {
        double area = PI*Math.pow(radio, 2);
        System.out.printf("El area del circulo es: %.2f\n",area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter= PI*diameter;
        System.out.printf("El perimetro del circulo es: %.2f\n",perimeter);
    }

}
