package Tasca_1_Herencia_Polimorfismo.Nivel_1_EJERCICIO_2;

public class Coche {

    static final String marca = "";
    static String modelo = "";
    final int potencia;

    public Coche(int potencia){
        // La marca no puede ser inicializada aquí porque es estática y final.
        // El modelo podría ser inicializado aquí, pero no sería lo usual ya que es estático.
        this.potencia = potencia;
    }
    static void frenar() {
        System.out.println("El vehículo está frenando");
    }

    void acelerar(){
        System.out.println("El vehículo está acelerando");
    }
}
