package Tasca_2_Exceptions.Nivel_3_EJERCICIO_3;
import java.util.Scanner;
public class Cine {
    private int filas;
    private int asientosPorFilas;
    private GestionButacas gestionButacas;

    public Cine() {
        this.gestionButacas = new GestionButacas();
        pedirDatosIniciales();
    }

    private void pedirDatosIniciales() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir numero de filas: ");
        this.filas = sc.nextInt();
        System.out.println("Introducir el numero de asientos por fila: ");
        this.asientosPorFilas = sc.nextInt();

    }

    public void iniciar() {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    mostrarButacas();
                    break;
                case 2:
                    mostrarButacasPersonas();
                    break;
                case 3:
                    reservarButaca();
                    break;
                case 4:
                    anularReserva();
                    break;
                case 5:
                    anularReservaPersona();
                    break;
                case 0:
                    System.out.println("Salir...");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 0);
    }

    private int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.- Mostrar todas las butacas reservadas.");
        System.out.println("2.- Mostrar las butacas reservadas por una persona.");
        System.out.println("3.- Reservar una butaca.");
        System.out.println("4.- Anular la reserva de una butaca.");
        System.out.println("5.- Anular todas las reservas de una persona.");
        System.out.println("0.- Salir....");
        System.out.println("Inroduzca una opción");
        return sc.nextInt();
    }

    private void mostrarButacas() {
        System.out.println("Butacas resevadas");
        for (Butaca butaca : gestionButacas.getButacas()) {
            System.out.println(butaca);
        }
    }

    private void mostrarButacasPersonas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir el nombre de la persona");
        String persona = sc.nextLine();
        boolean encontrada = false;

        System.out.println("Butacas reservadas por " + persona + ":");
        for (Butaca butaca : gestionButacas.getButacas()) {
            if (butaca.getPersona().equals(persona)) {
                System.out.println(butaca);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se han encontrado butacas reservadas por " + persona + ".");
        }
    }

    private void reservarButaca() {
        try {
            int fila = introducirFila();
            int asiento = introducirAsiento();
            String persona = introducirPersona();
            Butaca butaca = new Butaca(fila, asiento, persona);
            gestionButacas.añadirButaca(butaca);
            System.out.println("Butaca reservada correctamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void anularReserva() {
        try {
            int fila = introducirFila();
            int asiento = introducirAsiento();
            gestionButacas.eliminarButaca(fila, asiento);
            System.out.println("Reserva anulada correctamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void anularReservaPersona() {
        try {
            String persona = introducirPersona();
            gestionButacas.eliminarReservaPersona(persona);
            System.out.println("Todas las reservas de " + persona + " estan anuladas");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int introducirFila() throws ExcepcionesPersonalizadas.ExceptionFilaIncorrecta {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir número de fila: ");
        int fila = sc.nextInt();
        if (fila < 1 || fila > this.filas) {
            throw new ExcepcionesPersonalizadas.ExceptionFilaIncorrecta("Fila incorrecta");
        }
        return fila;
    }

    private int introducirAsiento() throws ExcepcionesPersonalizadas.ExceptionAsientoIncorrecto {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir numero de asientos");
        int asientos = sc.nextInt();
        if (asientos < 1 || asientos > this.asientosPorFilas) {
            throw new ExcepcionesPersonalizadas.ExceptionAsientoIncorrecto("Asiento incorrecto");
        }
        return asientos;
    }

    private String introducirPersona() throws ExcepcionesPersonalizadas.ExceptionPersonaIncorrecta {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la persona");
        String persona = sc.next();
        if (persona.matches(".*\\d.*")) {
            throw new ExcepcionesPersonalizadas.ExceptionPersonaIncorrecta("El nombre no puede contener números");
        }
        return persona;
    }
}
