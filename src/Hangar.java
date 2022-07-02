import java.util.ArrayList;

public class Hangar extends Aeropuerto {
    protected Integer capacidad;
    protected ArrayList<Avion> aviones;
    protected Integer ocupados;

    public Hangar(Integer capacidad) {
        this.aviones = new ArrayList<Avion>();
        this.capacidad = capacidad;
        ocupados = 0;
    }

    public void mostrarAviones() {
        if(aviones.isEmpty()){
            System.out.println("No hay aviones en este hangar");
        }else{
            for (Avion a : aviones) {
                a.mostrarDatosAvion();
            }
        }
    }

    public int removeAvion(Avion avion) {
        if (avionesActuales > 0) {  // Si hay aviones en el aeropuerto
            if (this.ocupados > 0) {   // Si hay aviones en el hangar
                for (Avion a : aviones) {   // Dentro del hangar, buscar el avion pedido
                    if (a.equals(avion)) {
                        this.aviones.remove(avion);
                        this.ocupados -= 1;
                        avionesActuales -= 1;
                        avion.estado = Estado.DESPEGANDO;
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public int addAvion(Avion avion) {      // Los aviones se guardan en cualquier hangar
        if (avionesActuales < avionesPermitidos) {  // Si aeropuerto tiene lugar
            if (this.ocupados < this.capacidad) {   // Si entran mas aviones
                this.aviones.add(avion);
                this.ocupados += 1;
                avionesActuales += 1;
                avion.estado = Estado.ATERRIZANDO;
                return 1;
            }
        }
        return 0;
    }


    public void despegarAviones() {
        if (this.aviones.isEmpty()) {
            System.out.println("No hay aviones para despegar");
        } else {
            for (Avion a : aviones) {
                a.estado = Estado.DESPEGANDO;
            }
            aviones.clear();
        }
    }


    @Override
    public String toString() {
        return "Hangar{" +
                "capacidad=" + capacidad +
                ", ocupados=" + ocupados +
                ", aviones=" + aviones +
                '}';
    }
}
