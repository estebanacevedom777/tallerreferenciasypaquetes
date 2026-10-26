package aerolinea.modelo;

public class pasajero {

    private String nombre;
    private vuelo vuelo;      // empieza en null: aún no tiene reserva

    public pasajero(String nombre) {
        this.nombre = nombre;
        this.vuelo = null;
    }

    public vuelo getVuelo() {
        return vuelo;
    }

    public void reservar(vuelo unVuelo) {
        if (unVuelo == null) {
            System.out.println(nombre + ": no hay vuelo");
        } else if (unVuelo.reservarSilla()) {
            this.vuelo = unVuelo;     // se guarda solo si la reserva funcionó
            System.out.println(nombre + " reservó en " + unVuelo.getCodigo());
        } else {
            System.out.println(nombre + ": vuelo " + unVuelo.getCodigo() + " lleno");
        }
    }

    public void mostrarReserva() {
        if (vuelo == null) {
            System.out.println(nombre + ": sin reserva");
        } else {
            System.out.println(nombre + " viaja a " + vuelo.getDestino());
        }
    }
}