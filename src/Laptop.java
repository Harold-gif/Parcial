class Laptop extends Producto implements Vendible {
    private String procesador;
    private int memoriaRAM;

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, int memoriaRAM) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.cantidadStock = cantidadStock;

    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop: " + nombre + " | Marca: " + marca + " | Precio: $" + precio +
                " | Stock: " + cantidadStock + " | Procesador: " + procesador +
                " | RAM: " + memoriaRAM + "GB");
    }


    @Override
    public double calcularPrecioVenta(int cantidad) {
        double precioTotal = precio * cantidad;
        if (cantidad > 5) {
            precioTotal *= 0.9;
        }
        return precioTotal;
    }
}

