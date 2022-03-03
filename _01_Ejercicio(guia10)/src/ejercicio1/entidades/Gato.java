
package ejercicio1.entidades;


public class Gato extends Animal {

    public Gato(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }
    @Override
    public void Alimentarse(){
           System.out.printf("EL GATO SE ALIMENTA CON %s\n",this.alimento);

    }
    
}
