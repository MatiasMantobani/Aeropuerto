import java.util.ArrayList;

public class Carga extends Avion implements Descargar{
    protected Double cantidadKilogramos;
    protected ArrayList<String> productosTransportados;

    // Es de carga, no tiene asientos
    public Carga(String modelo, String marca, String tipoMotor, Double capacidadCombustible, Double cantidadKilogramos, ArrayList<String> productosTransportados) {
        super(modelo, marca, tipoMotor, capacidadCombustible);
        this.cantidadKilogramos = cantidadKilogramos;
        this.productosTransportados = productosTransportados;
    }


    @Override
    protected String generarCodigoAvion() {
        return "CARGA";
    }

    @Override
    public String toString() {
        return "Carga{" +
//                "cantidadKilogramos=" + cantidadKilogramos +
//                ", productosTransportados=" + productosTransportados +
                '}';
    }
}
