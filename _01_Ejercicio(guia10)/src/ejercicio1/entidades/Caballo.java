
package ejercicio1.entidades;


public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }
    
    @Override
    public void Alimentarse(){
            System.out.printf("EL CABALLO SE ALIMENTA CON %s\n",this.alimento);
    }
    
}
