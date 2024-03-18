package Tasca_1_Herencia_Polimorfismo.Nivel_1_EJERCICIO_2;

public class Main {
    public static void main(String[] args) {
        // estático
        Coche.frenar();

        // Instancia de Coche y llamar a un método no estático
        Coche coche1 = new Coche(120);
        coche1.acelerar();
    }
}
