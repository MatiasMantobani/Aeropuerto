import java.util.ArrayList;

public class Aeropuerto {

    protected final String nombre = "Aeropuerto Internacional Astor Piazolla";
    protected final String codigoInternacional = "IATA: MDQ OACI: SAZM";
    protected final String direccion = "Autovia 2 Km 398.5, Mar del Plata, Provincia de Buenos Aires";

    protected static Integer avionesPermitidos = 4;    // legalmente
    protected static Integer avionesActuales = 0;
    protected ArrayList<Hangar> hangares = new ArrayList<>();

    public Aeropuerto() {

    }

    public void mostrarHangares() {
        for (Hangar h : hangares) {
            System.out.println("    --- HANGAR ---");
            h.mostrarAviones();
        }
    }

    public void despegarAvion(Avion avion) {
        int flag = 0;
        for (Hangar h : hangares) {
            flag = h.removeAvion(avion);
            if(flag ==1){
                break;
            }
        }
    }


    public void aterrizarAvion(Avion avion) {
        int flag = 0;
        for (Hangar h : hangares) {
            flag = h.addAvion(avion);
            if(flag ==1){
                break;
            }
        }
    }
//        if (avion instanceof Militar) {
//            System.out.println("Ingresando avion Militar");
//        } else if (avion instanceof Carga) {
//            System.out.println("Ingresando avion Carga");
//        } else if (avion instanceof Privado) {
//            System.out.println("Ingresando avion Privado");
//        } else {
//            System.out.println("Ingresando avion Comercial");
//        }


    public void addHangar(Hangar hangar) {
        this.hangares.add(hangar);
    }


    @Override
    public String toString() {
        return "Aeropuerto{" +
//                "nombre='" + nombre + '\'' +
//                ", codigoInternacional='" + codigoInternacional + '\'' +
//                ", direccion='" + direccion + '\'' +
                ", hangares=" + hangares +
                '}';
    }
}
