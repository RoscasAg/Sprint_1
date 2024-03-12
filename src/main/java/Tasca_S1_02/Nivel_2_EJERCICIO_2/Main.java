package Tasca_S1_02.Nivel_2_EJERCICIO_2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        byte edad = Entrada.leerByte("Introduce tu edad: ");
        System.out.println("La edad introducida es: " + edad);
        int numero = Entrada.leerInt("Introduce un numero: ");
        System.out.println("El número introducido es: " + numero);
        float altura = Entrada.leerFloat("Introduzca la altura: ");
        System.out.println("La altura introducida es: " + altura);
        double peso = Entrada.leerDouble("Introduzca el peso: ");
        System.out.println("El preso introducido es: " + peso);
        char inicial = Entrada.leerChar("Introduca Inicial de su nombre: ");
        System.out.println("La inicial de su nomobre introducida es: " + inicial);
        String nombre = Entrada.leerString("Introduzca un nombre: ");
        System.out.println("El nombre introducido es: " + nombre);
        boolean continuar = Entrada.leerBoolean("Desea contuar si/no: ");
        System.out.println("Has decidido " + continuar);
    }
}

