package estado;

public class Promocion implements Estado {
    private int descuento;

    public Promocion(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public int precioFinal(int precioBase) {
        return precioBase - descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
