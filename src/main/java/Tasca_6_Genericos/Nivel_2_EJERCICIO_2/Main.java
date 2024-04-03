package Tasca_6_Genericos.Nivel_2_EJERCICIO_2;

public class Main {
    public static void main(String[] args) {
        // Creación de una instancia de Persona
        Persona persona = new Persona("Sergio", "Altarriba", 45);
        // Creación de un String para usar como argumento (ahora el segundo argumento debe ser un String)
        String unString = "Hola Barcelona";
        // Creación de un tipo primitivo para usar como argumento
        int unNumero = 2024;

        // Instancia de GenericMethods para usar el método modificado
        GenericMethods gm = new GenericMethods();
        // Llamada al método modificado con el tipo específico de parámetros requerido
        gm.imprimirArgumentos(persona, unString, unNumero); // Nota: el segundo argumento es un String
    }
}
