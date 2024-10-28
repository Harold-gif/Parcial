public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("MacBook Pro", "Apple", 2000, 10, "M1", 16);
        Celular celular1 = new Celular("Galaxy S22", "Samsung", 800, 20, 4000, 108);


        Cliente cliente1 = new Cliente("Hugo", "hugo.casame@gmail.com");
        Cliente cliente2 = new Cliente("Agustino", "AgustinoJimenes@gmail.com");


        cliente1.comprarProducto(laptop1, 3);
        cliente1.comprarProducto(celular1, 6);
        cliente2.comprarProducto(celular1, 2);
        cliente2.comprarProducto(laptop1, 7);

        cliente1.mostrarCompra();
        cliente2.mostrarCompra();

        System.out.println("Inventario actualizado:");
        laptop1.mostrarDetalles();
        celular1.mostrarDetalles();
    }
}