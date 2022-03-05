/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
 */
package ejercicio2.entidades;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;
    private Scanner teclado;

    public Electrodomestico() {
        teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E') {
            this.consumoEnergetico='F';
        }
        this.consumoEnergetico = letra;
    }

    public void comprobarColor(String color) {
        if (!color.equalsIgnoreCase("Negro") || !color.equalsIgnoreCase("Rojo") || !color.equalsIgnoreCase("Azul") || !color.equalsIgnoreCase("Gris")) {
            this.color = "Blanco";
        }
        this.color= color;
    }
    
    public void crearElectrodomestico() {
        this.precio = 1000d;
        do {
            System.out.println("CREAR ELECTRODOMESTICO\n Ingrese Color");
            comprobarColor(teclado.next());
            System.out.println(" Ingrese Consumo entre A y F");
            comprobarConsumoEnergetico(teclado.next().toUpperCase().charAt(0));
            System.out.println("Ingrese el peso");
            this.peso = teclado.nextDouble();
        } while (this.color==null || this.peso==null || this.precio ==null || this.consumoEnergetico==' ');
        
    }
    public double precioFinal(){
        switch (this.consumoEnergetico) {
            case 'A':
                this.precio+=1000;   
                break;
            case 'B':
                this.precio+=800;   
                break;
            case 'C':
                this.precio+=600;   
                break;
            case 'D':
                this.precio+=500;   
                break;
            case 'E':
                this.precio+=300;   
                break;
            case 'F':
                this.precio+=100;   
                break;    
        }
        if(this.peso > 1 && this.peso <= 19){
            this.precio += 100;
        }else if(this.peso >= 20 && this.peso <= 49){
            this.precio += 500;
        }else if(this.peso >= 50 && this.peso <= 79){
            this.precio += 800;
        }else if(this.peso > 80){
            this.precio += 1000;
        }
        return this.precio;
        
    }

    @Override
    public String toString() {
        return String.format("Electrodomestico: precio= %.2f color= %s consumo= %s peso= %s", precio, color, consumoEnergetico, peso );
    }

}
