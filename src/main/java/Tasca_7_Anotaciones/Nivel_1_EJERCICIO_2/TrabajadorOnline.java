package Tasca_7_Anotaciones.Nivel_1_EJERCICIO_2;

public class TrabajadorOnline extends Trabajador {
    private static final double TARIFA_INTERNET = 50.0;

    public TrabajadorOnline(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + TARIFA_INTERNET;
    }

    // Método obsoleto
    @Deprecated
    public void mostrarMensaje() {
        System.out.println("Este método está obsoleto.");
    }
}
