package Tasca_1_Herencia_Polimorfismo.Nivel_1_EJERCICIO_1;

public class Percusion extends Instrumento{
    public Percusion(String nombre, double precio){
        super(nombre, precio);
    }

    @Override
    public void tocar(){
        System.out.println("Está sonando un instrumento de percusión");
    }
}
