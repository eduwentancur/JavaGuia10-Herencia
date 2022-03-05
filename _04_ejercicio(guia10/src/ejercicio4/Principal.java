package ejercicio4;

import ejercicio4.entidades.Circle;
import ejercicio4.entidades.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opcion;
        do {
            System.out.println("CALCULA AREA Y PERIMETRO");
            System.out.println("1-Circulo");
            System.out.println("2-Rectangulo");
            System.out.println("3-Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    Circle circle = new Circle();
                    System.out.println("Ingrese el radio del circulo");
                    circle.setRadio(teclado.nextDouble());
                    System.out.println("Ingrese el diametro del circulo");
                    circle.setDiameter(teclado.nextDouble());
                    circle.calculateArea();
                    circle.calculatePerimeter();
                    break;
                case 2:
                    System.out.println("Ingrese la base del rectangulo");
                    double base = teclado.nextDouble();
                    System.out.println("Ingrese altura del rectangulo");
                    double height = teclado.nextDouble();
                    Rectangle rectangle = new Rectangle(base, height);
                    rectangle.calculateArea();
                    rectangle.calculatePerimeter();
                    break;
                case 3:
                    System.out.println("ADIOS!");
                    break;
                default:
                    System.out.println("Ingreso opcion incorrecta");
            }
        } while (opcion != 3);
    }
}
