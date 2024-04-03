package Tasca_4_Testing.Nivel_1_EJERCICIO_2;

public class CalculoDni {
    public static void main(String[] args) {
        int numeroDni= 78901239;
        char letra = calcularLetra(numeroDni);
        System.out.println("La letra del DNI es: " + letra);
    }
    private static final char[] LETRAS_DNI = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    public static char calcularLetra(int numeroDni){
        int resto = numeroDni % 23;
        return LETRAS_DNI[resto];
    }
}
