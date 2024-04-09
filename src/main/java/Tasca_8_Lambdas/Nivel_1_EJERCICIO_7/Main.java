package Tasca_8_Lambdas.Nivel_1_EJERCICIO_7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Lista mixta y ordenación
        List<Object> mixta = List.of("Hola", 3, "Mundo", 7, "Java", 10, "Código");

        // Ordena la s cadenas de más corta a más larga
        List<String> ordenada = mixta.stream()
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Ordenada de más corta a más larga: " + ordenada);

        // Ordena las cadenas de más larga a más corta
        List<String> ordenadaReversa = mixta.stream()
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .sorted((a, b) -> b.length() - a.length())
                .collect(Collectors.toList());
        System.out.println("Ordenada de más larga a más corta: " + ordenadaReversa);
    }
}
