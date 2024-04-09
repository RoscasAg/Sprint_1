package Tasca_8_Lambdas.Nivel_1_EJERCICIO_3;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroStrings {
    public static void main(String[] args) {
        // Lista de Strings para filtrar
        List<String> meses = List.of("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
        meses.forEach(mes -> System.out.println(mes));
    }
}
