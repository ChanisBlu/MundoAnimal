package mx.com.animales;

public class Velociraptor extends Animal implements Movible {

    public Velociraptor(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.print("Sonido: Grrraaa | ");
    }

    @Override
    public void moverse() {
        System.out.println("Movimiento: Corre a 60 km/h");
    }
}