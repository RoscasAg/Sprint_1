package Tasca_2_Exceptions.Nivel_1_EJERCICIO_1;

public class Main {
    public static void main(String[] args) {
        Venta venta = new Venta();

        try {
            venta.calcularTotal();
        } catch (VentaBuidaException var4) {
            System.out.println(var4.getMessage());
        }

        venta.agregarProducto(new Producto("Agua", 0.5));
        venta.agregarProducto(new Producto("Platano", 0.25));
        venta.agregarProducto(new Producto("Leche", 1.45));

        try {
            venta.calcularTotal();
        } catch (VentaBuidaException var3) {
            System.out.println(var3.getMessage());
        }

        System.out.println("La compra asciende a " + venta.getPrecioTotal() + " euros");
    }
}
