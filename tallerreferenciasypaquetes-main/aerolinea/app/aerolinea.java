package aerolinea.app;

import aerolinea.modelo.pasajero;
import aerolinea.modelo.vuelo;

public class aerolinea {
    public static void main(String[] args) {
        vuelo v = new vuelo("AV-204", "Cartagena", 2);
        pasajero p1 = new pasajero("Sara");
        pasajero p2 = new pasajero("Tomás");
        pasajero p3 = new pasajero("Lina");

        p3.mostrarReserva();

        p1.reservar(v);
        p2.reservar(v);
        p3.reservar(v);

        System.out.println(v.getSillasDisponibles());

        v.setDestino("Santa Marta");

        p1.mostrarReserva();
        p2.mostrarReserva();
        p3.mostrarReserva();

        System.out.println(p1.getVuelo() == p2.getVuelo());
    }
}