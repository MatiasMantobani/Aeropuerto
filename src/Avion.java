public abstract class Avion{
    protected String modelo;
    protected String marca;
    protected String tipoMotor;
    protected Double capacidadCombustible;
    protected Integer cantidadAsientos;
    protected Estado estado = Estado.SINASIGNAR;
    protected String codigoAvion;   //se puede cambiar por enum



    // Aviones no de carga
    public Avion(String modelo, String marca, String tipoMotor, Double capacidadCombustible, Integer cantidadAsientos) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipoMotor = tipoMotor;
        this.capacidadCombustible = capacidadCombustible;
        this.cantidadAsientos = cantidadAsientos;
        this.codigoAvion = generarCodigoAvion();
    }


    // Aviones de carga
    public Avion(String modelo, String marca, String tipoMotor, Double capacidadCombustible) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipoMotor = tipoMotor;
        this.capacidadCombustible = capacidadCombustible;
        this.cantidadAsientos = 0;
        this.codigoAvion = generarCodigoAvion();
    }




    protected abstract String generarCodigoAvion();


    public void mostrarDatosAvion(){
        System.out.println(this.codigoAvion);
    }


    @Override
    public String toString() {
        return "Avion{" +
//                "modelo='" + modelo + '\'' +
//                ", marca='" + marca + '\'' +
//                ", tipoMotor='" + tipoMotor + '\'' +
//                ", capacidadCombustible=" + capacidadCombustible +
//                ", cantidadAsientos=" + cantidadAsientos +
//                ", estado=" + estado +
                ", codigoAvion='" + codigoAvion + '\'' +
                '}';
    }
}
