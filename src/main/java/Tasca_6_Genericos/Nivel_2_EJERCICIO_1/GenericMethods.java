package Tasca_6_Genericos.Nivel_2_EJERCICIO_1;

public class GenericMethods {
    // Método genérico que acepta los tres argumentos de tipos genéricos T, U, y V
    public <T, U, V> void imprimirArgumentos(T arg1, U arg2, V arg3) {
        System.out.println("Argumento 1: " + arg1);
        System.out.println("Argumento 2: " + arg2);
        System.out.println("Argumento 3: " + arg3);
    }
}
