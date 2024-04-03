package Tasca_5_Java_Utils.Nivel_1_EJERCICIO_2;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectorioAlfabetico {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static void listarContenidoDirectorio(String rutaDirectorio, String indentacion) {
        File directorio = new File(rutaDirectorio);
        File[] archivos = directorio.listFiles();

        if (archivos != null && archivos.length > 0) {
            Arrays.sort(archivos, (archivo1, archivo2) -> archivo1.getName().compareToIgnoreCase(archivo2.getName()));

            for (File archivo : archivos) {
                String tipo = archivo.isDirectory() ? "D" : "F";
                String fechaModificacion = sdf.format(archivo.lastModified());
                System.out.println(indentacion + "|-- " + archivo.getName() + " (" + tipo + ") - " + fechaModificacion);

                if (archivo.isDirectory()) {
                    listarContenidoDirectorio(archivo.getAbsolutePath(), indentacion + "   ");
                }
            }
        } else {
            System.out.println(indentacion + "El directorio está vacío o no se pudo leer.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce la ruta del directorio a listar:");
        String rutaDirectorio = scanner.nextLine();

        System.out.println("Listando contenido de: " + rutaDirectorio);
        listarContenidoDirectorio(rutaDirectorio, "");
    }
}