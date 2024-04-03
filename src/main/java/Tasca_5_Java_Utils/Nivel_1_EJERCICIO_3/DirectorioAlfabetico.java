package Tasca_5_Java_Utils.Nivel_1_EJERCICIO_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectorioAlfabetico {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static void listarContenidoDirectorio(String rutaDirectorio, String indentacion, PrintWriter writer) {
        File directorio = new File(rutaDirectorio);
        File[] archivos = directorio.listFiles();

        if (archivos != null && archivos.length > 0) {
            Arrays.sort(archivos, (archivo1, archivo2) -> archivo1.getName().compareToIgnoreCase(archivo2.getName()));

            for (File archivo : archivos) {
                String tipo = archivo.isDirectory() ? "D" : "F";
                String fechaModificacion = sdf.format(archivo.lastModified());
                writer.println(indentacion + "|-- " + archivo.getName() + " (" + tipo + ") - " + fechaModificacion);

                if (archivo.isDirectory()) {
                    listarContenidoDirectorio(archivo.getAbsolutePath(), indentacion + "   ", writer);
                }
            }
        } else {
            writer.println(indentacion + "El directorio está vacío o no se pude leer.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce la ruta del directorio a listar:");
        String rutaDirectorio = scanner.nextLine();

        System.out.println("Introduce el nombre del archivo de salida incluyendo la ruta:");
        String nombreArchivoSalida = scanner.nextLine();

        try (PrintWriter writer = new PrintWriter(nombreArchivoSalida)) {
            writer.println("Listando contenido de: " + rutaDirectorio);
            listarContenidoDirectorio(rutaDirectorio, "", writer);
            System.out.println("El listado del directorio ha sido guardado en: " + nombreArchivoSalida);
        } catch (FileNotFoundException e) {
            System.out.println("Error al crear el archivo de salida: " + e.getMessage());
        }
    }
}
