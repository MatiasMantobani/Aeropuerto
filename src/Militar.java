import java.util.ArrayList;
import java.util.Objects;

public class Militar extends Avion{
    protected Boolean armasAireAire;
    protected Boolean armasAireTierra;
    protected Integer cantidadBalas;

    // no es de carga, tiene asientos
    public Militar(String modelo, String marca, String tipoMotor, Double capacidadCombustible, Integer cantidadAsientos, Boolean armasAireAire, Boolean armasAireTierra, Integer cantidadBalas) {
        super(modelo, marca, tipoMotor, capacidadCombustible, cantidadAsientos);
        this.armasAireAire = armasAireAire;
        this.armasAireTierra = armasAireTierra;
        this.cantidadBalas = cantidadBalas;
    }


    @Override
    protected String generarCodigoAvion() {
        return "MILITAR";
    }

    @Override
    public String toString() {
        return "Militar{" +
//                "armasAireAire=" + armasAireAire +
//                ", armasAireTierra=" + armasAireTierra +
//                ", cantidadBalas=" + cantidadBalas +
                '}';
    }
}
