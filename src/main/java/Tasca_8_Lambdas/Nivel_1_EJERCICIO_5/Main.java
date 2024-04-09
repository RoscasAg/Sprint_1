package Tasca_8_Lambdas.Nivel_1_EJERCICIO_5;

public class Main {
    @FunctionalInterface
    interface PiValueProvider {
        double getPiValue();
    }

    public static void main(String[] args) {
        PiValueProvider piValueProvider = () -> 3.1415;
        System.out.println(piValueProvider.getPiValue());
    }
}
