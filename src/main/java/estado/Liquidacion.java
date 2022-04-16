package estado;

public class Liquidacion implements Estado {

    public Liquidacion() {
    }

    @Override
    public int precioFinal(int precioBase) {
        return (int) (precioBase * 0.5);
    }
}
