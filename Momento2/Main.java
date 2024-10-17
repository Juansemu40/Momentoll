public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("7893214565", "Juan Sebastian Muñoz Caicedo");

        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        Foto[] fotos = { foto1, foto2 };

        Impresion impresion = new Impresion(1, " A color", fotos);
        Camara camara = new Camara(2, "Nikon", "VIK A-80");

        Producto[] productos = { impresion, camara };
        Pedido pedido = new Pedido(cliente, productos,  123456789);

        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Fecha: " + pedido.getFechaFormateada());
        for (Producto producto : pedido.getProductos()) {
            if (producto instanceof Impresion) {
                System.out.println("Producto: Impresión, Tipo de Impresion: " + ((Impresion) producto).getColor());
                for (Foto foto : ((Impresion) producto).getFotos()) {
                    foto.print();
                }
            } else if (producto instanceof Camara) {
                System.out.println("Producto: Cámara, Marca: " + ((Camara) producto).getMarca() +
                        ", Modelo: " + ((Camara) producto).getModelo());
            }
        }
    }
}
