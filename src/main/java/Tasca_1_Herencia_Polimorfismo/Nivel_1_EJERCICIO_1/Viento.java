package Tasca_1_Herencia_Polimorfismo.Nivel_1_EJERCICIO_1;

public class Viento extends Instrumento{
    public Viento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar(){
        System.out.println("Está sonando un instrumento de viento");
    }
}
