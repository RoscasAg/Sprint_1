package Tasca_S1_S2.Nivel_1_EJERCICIO_1;

public class EjemploException {

    public static void main(String[] args) {
        int[] enteros = new int[3];

        try {
            enteros[4] = 0;
        } catch (ArrayIndexOutOfBoundsException var3) {
            System.out.println(var3.getMessage());
        }

    }
}
