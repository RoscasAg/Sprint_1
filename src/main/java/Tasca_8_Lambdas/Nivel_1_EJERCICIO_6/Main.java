package Tasca_8_Lambdas.Nivel_1_EJERCICIO_6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Lista mixta de String y Integer
        List<Object> mixta = List.of("Hoy", 3, "Martes", 7, "Java", 10, "Datos");

        // Filtramos para obtener solo las cadenas y luego las ordenamos por longitud
        List<String> ordenada = mixta.stream()
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println(ordenada);
    }
}
