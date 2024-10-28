import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados;
    private List<Integer> cantidadesCompradas;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = new ArrayList<>();
        this.cantidadesCompradas = new ArrayList<>();
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.cantidadStock >= cantidad) {
            productosComprados.add(producto);
            cantidadesCompradas.add(cantidad);
            producto.actualizarStock(cantidad);
        } else {
            System.out.println("No hay suficiente stock para poder avanzar con el producto: " + producto.nombre);
        }
    }

    public void mostrarCompra() {
        System.out.println("Cliente: " + nombre + " | Correo: " + correo);
        double totalCompra = 0;
        for (int i = 0; i < productosComprados.size(); i++) {
            Producto producto = productosComprados.get(i);
            int cantidad = cantidadesCompradas.get(i);
            double precioVenta = ((Vendible) producto).calcularPrecioVenta(cantidad);
            totalCompra += precioVenta;
            producto.mostrarDetalles();
            System.out.println("Cantidad comprada: " + cantidad + " | Costo: $" + precioVenta);
        }
        System.out.println("Costo total de la compra realizada: $" + totalCompra + "\n");
    }
}