package Tasca_7_Anotaciones.Nivel_1_EJERCICIO_1;

public class Principal {
    public static void main(String[] args) {
        Trabajador trabajadorOnline = new TrabajadorOnline("Sergio", "Altarriba", 28);
        Trabajador trabajadorPresencial = new TrabajadorPresencial("Altarriba", "Sergio", 35);

        int horasTrabajadas = 160;

        System.out.println("Sueldo Trabajador Online: " + trabajadorOnline.calcularSueldo(horasTrabajadas));
        System.out.println("Sueldo Trabajador Presencial: " + trabajadorPresencial.calcularSueldo(horasTrabajadas));
    }
}
