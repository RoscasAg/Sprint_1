package Tasca_1_Herencia_Polimorfismo.Nivel_1_EJERCICIO_1;

public abstract class Instrumento {
     String nombre;
     double precio;

    public Instrumento(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public abstract void tocar();
}
