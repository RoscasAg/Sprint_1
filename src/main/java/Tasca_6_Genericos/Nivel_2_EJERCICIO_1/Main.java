package Tasca_6_Genericos.Nivel_2_EJERCICIO_1;

public class Main {
    public static void main(String[] args) {
        // Creación de una instancia de Persona
        Persona persona = new Persona("Sergio", "Altarriba", 45);
        // Creación de un String y un tipo primitivo para usar como argumentos
        String unString = "Hola Barcelona";
        int unNumero = 2024;

        // Instancia de GenericMethods para usar el método genérico


        GenericMethods gm = new GenericMethods();
        // Llamada al método genérico con diferentes tipos de parámetros
        gm.imprimirArgumentos(persona, unString, unNumero);
    }
}
