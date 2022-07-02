import java.util.ArrayList;

public class Comercial extends Avion implements Comida, Mantas{
    protected Integer cantidadAzafatas;
    protected ArrayList<String> listaServicios;

    // no es de carga, tiene cant asientos
    public Comercial(String modelo, String marca, String tipoMotor, Double capacidadCombustible, Integer cantidadAsientos, Integer cantidadAzafatas, ArrayList<String> listaServicios) {
        super(modelo, marca, tipoMotor, capacidadCombustible, cantidadAsientos);
        this.cantidadAzafatas = cantidadAzafatas;
        this.listaServicios = listaServicios;
    }


    @Override
    public String toString() {
        return "Comercial{" +
//                "cantidadAzafatas=" + cantidadAzafatas +
//                ", listaServicios=" + listaServicios +
                '}';
    }

    @Override
    protected String generarCodigoAvion() { //reemplazar con enum
        return "COMERCIAL";
    }

    @Override
    public void mantas() {
        System.out.println("Actualmente se estan sirviendo mantas en este avion");
    }

   // No hace falta override de comida() por default


}
