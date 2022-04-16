package repositorios;

import venta.Venta;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TiendaDeRopa {
    private List<Venta> ventas;
    private int gananciaDelDia;

    public TiendaDeRopa(List<Venta> ventas, int gananciaDelDia) {
        this.ventas = ventas;
        this.gananciaDelDia = gananciaDelDia;
    }

    void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    public int gananciaDia() {
        ventasDelDia(LocalDate.now()).forEach(venta -> gananciaDelDia = gananciaDelDia + venta.importe());
        return gananciaDelDia;
    }

    List<Venta> ventasDelDia(LocalDate fecha) {
        return ventas.stream().filter(venta -> venta.esDeFecha(fecha)).collect(Collectors.toList());
    }
}
