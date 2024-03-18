package Tasca_1_Herencia_Polimorfismo.Nivel_1_EJERCICIO_1;
public class Main {
    public static void main(String[] args) {

        Instrumento flauta = new Viento("Flauta", 99.99);
        Instrumento guitarra = new Cuerda("Guitarra", 150.00);
        Instrumento tambor = new Percusion("Tambor", 59.95);

        flauta.tocar();
        guitarra.tocar();
        tambor.tocar();
    }
}