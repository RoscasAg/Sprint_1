package Catas.Piedra_Papel_Tijeras;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] elecciones = {"Piedra", "Papel", "Tijeras"};
        System.out.println("Elige: Piedra, Papel o Tijeras");
        String eleccionUsuario = scanner.nextLine();

        int indiceEleccionComputadora = random.nextInt(elecciones.length);
        String eleccionComputadora = elecciones[indiceEleccionComputadora];
        System.out.println("Computadora eligió: " + eleccionComputadora);

        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            System.out.println("Empate!");
        } else if ("Piedra".equalsIgnoreCase(eleccionUsuario) && "Tijeras".equalsIgnoreCase(eleccionComputadora)
                || "Papel".equalsIgnoreCase(eleccionUsuario) && "Piedra".equalsIgnoreCase(eleccionComputadora)
                || "Tijeras".equalsIgnoreCase(eleccionUsuario) && "Papel".equalsIgnoreCase(eleccionComputadora)) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }

        scanner.close();
    }
}

