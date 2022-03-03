/*
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio
*/
package ejercicio2.entidades;

import java.util.Locale;
import java.util.Scanner;


public class Lavadora extends Electrodomestico {
    
    private Double carga;
    private Scanner teclado;

    public Lavadora() {
        this.teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public Lavadora(Double carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        System.out.println("LAVADORA");
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        this.carga=teclado.nextDouble();
        System.out.println("LAVADORA CREADA");
        precioFinal();
        
    }
    
    @Override
    public double precioFinal(){
        if (this.precio>30) {
            this.precio+=500;
        }
        return this.precio + super.precioFinal();
    }

    @Override
    public String toString() {
        return String.format("%s carga= %.2f KG", super.toString(), carga );
    }

    

    
    
    
    
    
}
