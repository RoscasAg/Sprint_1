package Tasca_1_Herencia_Polimorfismo.Nivel_2_EJERCICIO_1;

public class Smartphone extends Telefono implements Camara, Reloj{
    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void fotografiar() {

        System.out.println("Se está haciendo una foto");
    }
    public void alarma() {
        System.out.println("Está sonando la alarma");
    }

}
