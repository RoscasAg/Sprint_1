package Tasca_7_Anotaciones.Nivel_1_EJERCICIO_2;

public class Trabajador {
    private String nombre;
    private String apellido;
    private double precioHora;

    public Trabajador(String nombre, String apellido, double precioHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.precioHora = precioHora;
    }

    public double calcularSueldo(int horasTrabajadas) {
        return horasTrabajadas * precioHora;
    }
}
