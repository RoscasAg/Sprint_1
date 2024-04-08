package Tasca_7_Anotaciones.Nivel_1_EJERCICIO_2;

public class Principal {
    public static void main(String[] args) {
        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Sergio", "Altarriba", 30.0);
        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Altarriba", "Guerrero", 35.0);

        // Suprimir los warnings de métodos obsoletos
        @SuppressWarnings("deprecation")
        int horasTrabajadas = 160;

        // Invocar métodos obsoletos
        trabajadorOnline.mostrarMensaje();
        trabajadorPresencial.imprimirAdvertencia();
    }
}
