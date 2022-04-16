package estado;

public class Nueva implements Estado {

    public Nueva() {
    }

    @Override
    public int precioFinal(int precioBase) {
        return precioBase;
    }
}
