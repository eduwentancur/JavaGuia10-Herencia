/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
*/
package ejercicio2.entidades;

import java.util.Locale;
import java.util.Scanner;

public class Televisor extends Electrodomestico {
    
    private Double resolucion;
    private Boolean sintonizadorTDT;
    private Scanner teclado;

    public Televisor() {
        this.teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        System.out.println("TELEVISOR");
        super.crearElectrodomestico();
        System.out.println(" Ingrese resolucion del televisor");
        this.resolucion= teclado.nextDouble();
        System.out.println(" Ingrese si el televisor tiene TDT");
        System.out.println("1-[SI] 2-[NO]");
        this.sintonizadorTDT = teclado.nextInt()==1;
        System.out.println("TELEVISOR CREADO");
        precioFinal();
    }
    
    @Override
    public double precioFinal(){
        if (this.resolucion>40) {
            this.precio+=(precio*0.30);
        }
        if (sintonizadorTDT) {
            this.precio+=500;
        }
        return this.precio + super.precioFinal();
    }

    @Override
    public String toString() {
        return String.format("El televisor: %s con una resolucion= %s y sintonizadorTDT= %s\n", super.toString(),this.resolucion,this.sintonizadorTDT  );
    }
    
}
