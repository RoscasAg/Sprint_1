package Tasca_6_Genericos.Nivel_2_EJERCICIO_1;

public class Persona {
    // Atributos de la clase Persona
    String nombre;
    String apellido;
    int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método toString para imprimir los datos de la persona
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
