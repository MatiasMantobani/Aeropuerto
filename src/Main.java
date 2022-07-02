import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Aeropuerto aeropuerto1 = new Aeropuerto();


        // El aeropuerto cuenta con 4 hangares de capacidad fija y conocida
        aeropuerto1.addHangar(new Hangar(1));
        aeropuerto1.addHangar(new Hangar(2));
        aeropuerto1.addHangar(new Hangar(3));
        aeropuerto1.addHangar(new Hangar(4));


        // Aviones Comercial
        ArrayList<Comercial> comerciales = new ArrayList<>();
        ArrayList<String> servicios = new ArrayList<>();
        servicios.add("servicio1");
        servicios.add("servicio2");
        comerciales.add(new Comercial("modelo", "marca", "tipoMotor", 10000.0, 50, 7, servicios));
        comerciales.add(new Comercial("modelo", "marca", "tipoMotor", 10000.0, 50, 7, servicios));


        // avion privado
        ArrayList<Privado> privados = new ArrayList<>();
        privados.add(new Privado("modelo", "marca", "tipoMotor", 5000.0, 24, false, "Clave wifi"));
        privados.add(new Privado("modelo", "marca", "tipoMotor", 5000.0, 24, false, "Clave wifi"));
//        privados.get(0).verMundial(true);
//        privados.get(1).verMundial(false);


        // avion de carga
        ArrayList<Carga> cargas = new ArrayList<>();
        ArrayList<String> productos = new ArrayList<>();
        productos.add("Producto1");
        productos.add("Producto2");
        cargas.add(new Carga("modelo", "marca", "tipoMotor", 75000.0, 1500.0, productos));
        cargas.add(new Carga("modelo", "marca", "tipoMotor", 75000.0, 1500.0, productos));


        // aviones militar
        ArrayList<Militar> militares = new ArrayList<>();
        militares.add(new Militar("Modelo", "Marca", "tipoMotor", 500.0, 2, true, false, 2400));
        militares.add(new Militar("Modelo", "Marca", "tipoMotor", 500.0, 2, true, false, 2400));


        // Aterrizando aviones
        System.out.println("Aterrizando Avion");
        aeropuerto1.aterrizarAvion(comerciales.get(0));
        aeropuerto1.aterrizarAvion(privados.get(0));
        aeropuerto1.aterrizarAvion(cargas.get(0));
        aeropuerto1.aterrizarAvion(militares.get(0));
        aeropuerto1.mostrarHangares();

        // Despegando aviones
        System.out.println("Despegando Avion");
//        aeropuerto1.despegarAvion(cargas.get(0));
        aeropuerto1.despegarAvion(militares.get(0));
//        aeropuerto1.despegarAvion(privados.get(0));
        aeropuerto1.despegarAvion(comerciales.get(0));

        System.out.println("Mostrando Hangares");
        aeropuerto1.mostrarHangares();

    }
}
