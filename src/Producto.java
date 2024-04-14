
public class Producto {

    String nombre;
    double precio;
    double descuentoParaDebito;

    double calculaPrecioFinal(boolean pagoMedianteDebito) {
        double precioFinal;
        if (pagoMedianteDebito == true) {
            precioFinal = precio - descuentoParaDebito;
        } else {
            precioFinal = precio;
        }
        return precioFinal;
    }
}

