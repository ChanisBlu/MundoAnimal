package mx.com.animales;

public class Vaca extends Animal {

    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.print("Sonido: Muuu | ");
    }
}