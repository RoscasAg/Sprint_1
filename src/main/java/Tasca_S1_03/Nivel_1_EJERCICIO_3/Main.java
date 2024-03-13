package Tasca_S1_03.Nivel_1_EJERCICIO_3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countriesCapitals = new HashMap<>();
        try {
            Scanner fileScanner = new Scanner(new File("C:\\Users\\G731G\\IdeaProjects\\Sprint_1\\src\\main\\java\\Tasca_S1_03\\Nivel_1_EJERCICIO_3\\Ficheros\\countries.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    countriesCapitals.put(parts[0].trim(), parts[1].trim());
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String userName = sc.nextLine();
        int score = 0;

        List<String> keysAsArray = new ArrayList<>(countriesCapitals.keySet());
        Random random = new Random();
        if (!keysAsArray.isEmpty()) {
            for (int i = 0; i < 10; i++) {
                String country = keysAsArray.get(random.nextInt(keysAsArray.size()));
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

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("clasificacion.txt", true)))) {
            out.println(userName + ": " + score);
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
        }
        System.out.println("Tu resultado es " + score + " puntos.");
    }
}