package Tasca_2_Exceptions.Nivel_3_EJERCICIO_3;

public class ExcepcionesPersonalizadas {
    static class ExceptionPersonaIncorrecta extends Exception {
        public ExceptionPersonaIncorrecta(String message) {
            super(message);
        }
    }

    static class ExceptionFilaIncorrecta extends Exception {
        public ExceptionFilaIncorrecta(String message) {
            super(message);
        }
    }

    static class ExceptionAsientoIncorrecto extends Exception {
        public ExceptionAsientoIncorrecto(String message) {
            super(message);
        }
    }

    static class ExceptionButacaOcupada extends Exception {
        public ExceptionButacaOcupada(String message) {
            super(message);
        }
    }

    static class ExceptionAsientoLibre extends Exception {
        public ExceptionAsientoLibre(String message) {super(message);
        }
    }

}
