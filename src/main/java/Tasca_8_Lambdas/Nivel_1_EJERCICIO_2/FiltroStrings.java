package Tasca_8_Lambdas.Nivel_1_EJERCICIO_2;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroStrings {
    public static void main(String[] args) {
        // Lista de Strings para filtrar
        List<String> lista = List.of("Hoy", "Termino", "Spring1", "Empiezo", "Spring2", "Base de Datos");

        // Uso deL Streams para filtrar los Strings que contienen la letra  y también tienen más de 5 letras
        List<String> resultado2 = lista.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(resultado2);
    }
}
