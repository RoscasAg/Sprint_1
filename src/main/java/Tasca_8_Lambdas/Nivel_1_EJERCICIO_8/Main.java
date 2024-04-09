package Tasca_8_Lambdas.Nivel_1_EJERCICIO_8;


@FunctionalInterface
interface StringReverser {
    String reverse(String input);
}

public class Main {
    public static void main(String[] args) {
        StringReverser reverser = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reverser.reverse("Sergio Altarriba"));
    }
}