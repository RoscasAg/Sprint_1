package Tasca_6_Genericos.Nivel_2_EJERCICIO_2;

public class GenericMethods {
    // Método modificado que acepta un argumento genérico T, V y un String (ya no genérico)
    public <T, V> void imprimirArgumentos(T arg1, String arg2, V arg3) {
        System.out.println("Argumento 1: " + arg1);
        System.out.println("Argumento 2: " + arg2); // Este argumento ahora es un String
        System.out.println("Argumento 3: " + arg3);
    }
}
