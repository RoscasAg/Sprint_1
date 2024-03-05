package Nivel_2_EJERCICIO_1;

public class Telefono {
    protected String marca;
    protected String modelo;

    public Telefono(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void llamar(String numero){
        System.out.println("Se está llamando al número " + numero);
    }
}
