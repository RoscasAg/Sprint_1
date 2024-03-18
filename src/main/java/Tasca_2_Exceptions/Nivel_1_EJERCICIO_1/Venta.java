package Tasca_2_Exceptions.Nivel_1_EJERCICIO_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Venta {
    private ArrayList<Producto> productos = new ArrayList();
    private double precioTotal;

    public Venta() {
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void calcularTotal() throws VentaBuidaException {
        if (this.productos.isEmpty()) {
            throw new VentaBuidaException("Para hacer una venta hay que meter productos");
        } else {
            this.precioTotal = 0.0;

            Producto producto;
            for(Iterator var1 = this.productos.iterator(); var1.hasNext(); this.precioTotal += producto.getPrecio()) {
                producto = (Producto)var1.next();
            }

        }
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }
}
