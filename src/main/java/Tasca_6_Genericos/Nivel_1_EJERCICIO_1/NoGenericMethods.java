package Tasca_6_Genericos.Nivel_1_EJERCICIO_1;

public class NoGenericMethods {
    private Object objeto1;
    private Object objeto2;
    private Object objeto3;

    // Constructor que inicializa los tres objetos.
    // Los argumentos pueden ponerse en cualquier posición.
    public NoGenericMethods(Object objeto1, Object objeto2, Object objeto3) {
        this.objeto1 = objeto1;
        this.objeto2 = objeto2;
        this.objeto3 = objeto3;
    }

    // Métodos para almacenar objetos
    public void setObjeto1(Object objeto) {
        this.objeto1 = objeto;
    }

    public void setObjeto2(Object objeto) {
        this.objeto2 = objeto;
    }

    public void setObjeto3(Object objeto) {
        this.objeto3 = objeto;
    }

    // Métodos para extraer (obtener) los objetos
    public Object getObjeto1() {
        return objeto1;
    }

    public Object getObjeto2() {
        return objeto2;
    }

    public Object getObjeto3() {
        return objeto3;
    }

    public static void main(String[] args) {
        // Creación de una instancia de NoGenericMethods para almacenar objetos de tipo String.
        // Nota cómo los argumentos pueden ponerse en cualquier posición.
        NoGenericMethods ejemplo = new NoGenericMethods("Objeto1", "Objeto2", "Objeto3");
        NoGenericMethods otroEjemplo = new NoGenericMethods("Objeto3", "Objeto1", "Objeto2");

        // Extracción y muestra de los objetos almacenados
        System.out.println(ejemplo.getObjeto1());
        System.out.println(ejemplo.getObjeto2());
        System.out.println(ejemplo.getObjeto3());

        System.out.println(otroEjemplo.getObjeto1());
        System.out.println(otroEjemplo.getObjeto2());
        System.out.println(otroEjemplo.getObjeto3());
    }
}