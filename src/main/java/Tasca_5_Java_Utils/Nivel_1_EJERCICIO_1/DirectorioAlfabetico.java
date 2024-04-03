package Tasca_5_Java_Utils.Nivel_1_EJERCICIO_1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DirectorioAlfabetico {
    public static void listarContenidoDirectorio(String rutaDirectorio){

        File directorio = new File(rutaDirectorio);
        String[] contenido = directorio.list();

        if (contenido != null){
            Arrays.sort(contenido, String.CASE_INSENSITIVE_ORDER);
            System.out.println("Contenido del directorio: " + rutaDirectorio + ":");
            for (String elemento : contenido){
                System.out.println(elemento);
            }
        }else {
            System.out.println("El directorio no existe");
        }
    }

    public static String pideString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce la ruta del directorio:");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String rutaDirectorio = pideString();
        listarContenidoDirectorio(rutaDirectorio);
    }
}
