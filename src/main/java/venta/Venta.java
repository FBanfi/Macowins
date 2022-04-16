package venta;

import java.time.LocalDate;
import java.util.List;

public abstract class Venta {
    private List<Item> items;
    private int importe;
    private LocalDate fecha;

    public Venta(LocalDate fecha) {
        this.fecha = fecha;
    }

    public abstract int conRecargo(int importeBase);

    public int importe() {
        return conRecargo(calcularImportebase());
    }

    public int calcularImportebase() {
        items.stream().forEach(item -> importe = importe + item.importe());
        return this.importe;
    }

    public Boolean esDeFecha(LocalDate fecha) {
        return this.fecha.equals(fecha);
    }


    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
}
