package mx.com.animales;

public class Gato extends Animal implements Movible {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.print("Sonido: Miau | ");
    }

    @Override
    public void moverse() {
        System.out.println("Movimiento: Camina");
    }
}