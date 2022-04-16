package venta;

import prenda.Prenda;

public class Item {
    private Integer cantidad;
    private Prenda prenda;

    public Item(Integer cantidad, Prenda prenda) {
        this.cantidad = cantidad;
        this.prenda = prenda;
    }

    public int importe() {
        return prenda.precio() * cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }
}
