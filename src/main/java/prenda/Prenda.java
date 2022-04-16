package prenda;

import estado.Estado;

public class Prenda {
    private Estado estado;
    private int precioPropio;
    private TipoPrenda tipo;

    public Prenda(Estado estado, int precioPropio, TipoPrenda tipo) {
        this.estado = estado;
        this.precioPropio = precioPropio;
        this.tipo = tipo;
    }

    public int precio() {
        return estado.precioFinal(precioPropio);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getPrecioPropio() {
        return precioPropio;
    }

    public void setPrecioPropio(int precioPropio) {
        this.precioPropio = precioPropio;
    }

    public TipoPrenda getTipo() {
        return tipo;
    }

    public void setTipo(TipoPrenda tipo) {
        this.tipo = tipo;
    }
}
