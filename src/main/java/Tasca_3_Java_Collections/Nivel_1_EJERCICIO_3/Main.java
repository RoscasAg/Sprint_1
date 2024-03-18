package Tasca_3_Java_Collections.Nivel_1_EJERCICIO_3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countriesCapitals = new HashMap<>();
        // Corregido el error de sintaxis y el error tipográfico en la ruta del archivo
        try (Scanner fileScanner = new Scanner(new File("Ficheros/ountries.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    countriesCapitals.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
            System.out.println(e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String userName = sc.nextLine();
        int score = 0;

        List<String> keysAsArray = new ArrayList<>(countriesCapitals.keySet());
        Collections.shuffle(keysAsArray); // Mezcla la lista para evitar repetir preguntas
        Random random = new Random();
        if (!keysAsArray.isEmpty()) {
            for (int i = 0; i < Math.min(10, keysAsArray.size()); i++) {
                String country = keysAsArray.get(i); // Usa elementos mezclados secuencialmente
                System.out.println("¿Cuál es la capital de " + country + "?");
                String userAnswer = sc.nextLine();
                if (countriesCapitals.get(country).equalsIgnoreCase(userAnswer)) {
                    System.out.println("¡Correcto!");
                    score++;
                } else {
                    System.out.println("Incorrecto. La respuesta correcta es: " + countriesCapitals.get(country));
                }
            }
        } else {
            System.out.println("La lista de países está vacía.");
        }

        // No es necesario cerrar el Scanner del sistema (System.in) aquí

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("clasificacion.txt", true)))) {
            out.println(userName + ": " + score);
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
        System.out.println("Tu resultado es " + score + " puntos.");
    }
}