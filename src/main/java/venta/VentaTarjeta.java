package venta;

import java.time.LocalDate;

public class VentaTarjeta extends Venta {
    private int cantidadCuotas;
    private int coeficienteTarjeta;

    public VentaTarjeta(LocalDate fecha, int cantidadCuotas, int coeficienteTarjeta) {
        super(fecha);
        this.cantidadCuotas = cantidadCuotas;
        this.coeficienteTarjeta = coeficienteTarjeta;
    }

    @Override
    public int conRecargo(int importeBase){
        return (int) (importeBase * (coeficienteTarjeta * cantidadCuotas + 1.01));
    }
}
