package Tasca_7_Anotaciones.Nivel_1_EJERCICIO_1;

public class TrabajadorPresencial extends Trabajador {
    private static double gasolina = 100.0;

    public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + gasolina;
    }
}
