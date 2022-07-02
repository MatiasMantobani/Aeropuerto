public class Privado extends Avion implements Comida,Mantas,Mundial{
    protected Boolean jacuzzi;
    protected String claveWifi;

    // No es de carga, tiene asientos
    public Privado(String modelo, String marca, String tipoMotor, Double capacidadCombustible, Integer cantidadAsientos, Boolean jacuzzi, String claveWifi) {
        super(modelo, marca, tipoMotor, capacidadCombustible, cantidadAsientos);
        this.jacuzzi = jacuzzi;
        this.claveWifi = claveWifi;
    }

    @Override
    public void comida() {
        Comida.super.comida();
    }

    @Override
    public void mantas() {
        System.out.println("Dando mantas");
    }

    @Override
    public void verMundial(Boolean seVeMundial) {
        if(seVeMundial){
            System.out.println("En este avion se puede ver el mundial");
        }else{
            System.out.println("No se puede ver el mundial");
        }


    }

    @Override
    protected String generarCodigoAvion() {
        return "PRIVADO";
    }

    @Override
    public String toString() {
        return "Privado{" +
//                "jacuzzi=" + jacuzzi +
//                ", claveWifi='" + claveWifi + '\'' +
                '}';
    }
}
