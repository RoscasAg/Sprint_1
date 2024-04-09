package Tasca_8_Lambdas.Nivel_1_EJERCICIO_1;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroStrings {
    public static void main(String[] args) {
        // Lista de Strings para filtrar
        List<String> lista = List.of("Hoy", "Termino", "Spring1", "Empiezo", "Spring2", "Base de Datos");

        // Uso deL Streams para filtrar los Strings que contienen la letra 'o'
        List<String> resultado = lista.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());

        // Imprimir el resultado
        System.out.println(resultado);
    }
}
