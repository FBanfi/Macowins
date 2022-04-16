package venta;

import java.time.LocalDate;

public class VentaEfectivo extends Venta {

    public VentaEfectivo(LocalDate fecha) {
        super(fecha);
    }

    @Override
    public int conRecargo(int importeBase){
        return importeBase;
    }
}
