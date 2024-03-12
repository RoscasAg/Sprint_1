package Tasca_S1_02.Nivel_2_EJERCICIO_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner sc;

    public Entrada() {
    }

    public static byte leerByte(String mensaje) {
        while(true) {
            try {
                System.out.println(mensaje);
                return sc.nextByte();
            } catch (InputMismatchException var2) {
                System.out.println("Error de formato, intentalo de nuevo");
                sc.next();
            }
        }
    }

    public static int leerInt(String mensaje) {
        while(true) {
            try {
                System.out.println(mensaje);
                return sc.nextInt();
            } catch (InputMismatchException var2) {
                System.out.println("Error de formato. Intentalo de nuevo");
                sc.next();
            }
        }
    }

    public static float leerFloat(String mensaje) {
        while(true) {
            try {
                System.out.println(mensaje);
                return sc.nextFloat();
            } catch (InputMismatchException var2) {
                System.out.println("Error de formato, intantalo de nuevo");
                sc.next();
            }
        }
    }

    public static double leerDouble(String mensaje) {
        while(true) {
            try {
                System.out.println(mensaje);
                return sc.nextDouble();
            } catch (InputMismatchException var2) {
                System.out.println("Error de formato, intentalo de nuevo");
                sc.next();
            }
        }
    }

    public static char leerChar(String mensaje) {
        while(true) {
            try {
                System.out.println(mensaje);
                return sc.next().charAt(0);
            } catch (Exception var2) {
                System.out.println("Error de formato, intentalo de nuevo");
                sc.next();
            }
        }
    }

    public static String leerString(String mensaje) {
        while(true) {
            try {
                System.out.println(mensaje);
                return sc.next();
            } catch (Exception var2) {
                System.out.println("Error de formato, intentalo de nuevo");
                sc.next();
            }
        }
    }

    public static Boolean leerBoolean(String mensaje) {
        while(true) {
            try {
                System.out.println(mensaje + "s/n");
                String respuesta = sc.next();
                if ("s".equalsIgnoreCase(respuesta)) {
                    return true;
                }

                if ("n".equalsIgnoreCase(respuesta)) {
                    return false;
                }

                System.out.println("Responde 's' o 'n' ");
            } catch (Exception var2) {
                System.out.println("Error en el formato, intentalo de nuevo.");
            }
        }
    }

    static {
        sc = new Scanner(System.in);
    }
}
