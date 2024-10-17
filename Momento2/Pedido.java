import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private ZonedDateTime fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = ZonedDateTime.now(ZoneId.of("America/Bogota"));
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }
    public String getFechaFormateada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return fecha.format(formatter);
}
}
