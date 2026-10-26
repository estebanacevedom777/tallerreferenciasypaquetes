package biblioteca.app;

import biblioteca.modelo.libro;
import biblioteca.personas.socio;

public class biblioteca {
    public static void main(String[] args) {

        // Etapa 1
        libro l1 = new libro("Cien años de soledad", "García Márquez");
        l1.mostrarInformacion();

        // Etapa 2
        libro l2 = l1;
        libro l3 = new libro("Cien años de soledad", "García Márquez");
        l2.prestar();
        System.out.println(l1.estaDisponible());
        System.out.println(l3.estaDisponible());
        System.out.println(l1 == l2);
        System.out.println(l1 == l3);

        // Etapa 3
        libro l4 = null;
        if (l4 != null) {
            l4.mostrarInformacion();
        } else {
            System.out.println("No hay libro");
        }

        // Etapa 4
        l1.setTitulo("");
        System.out.println(l1.getTitulo());
        libro l5 = new libro("", "Anónimo");
        System.out.println(l5.getTitulo());

        // Etapa 5
        socio camila = new socio("Camila");
        camila.prestarLibro(l3);
        camila.prestarLibro(l1);
        camila.prestarLibro(null);
        System.out.println(camila.getLibrosPrestados());
        System.out.println(l3.estaDisponible());

        // Reto 1
        libro a = new libro("Ficciones", "Borges");
        libro b = new libro("Ficciones", "Borges");
        libro c = a;
        c.prestar();
        a = b;
        System.out.println(a.estaDisponible());
        System.out.println(c.estaDisponible());
        System.out.println(a == c);

        // Reto 2
        camila.devolverLibro(l3);
        System.out.println(camila.getLibrosPrestados());
        System.out.println(l3.estaDisponible());
        camila.devolverLibro(null);

        // Reto 3
        System.out.println(l1.mismoTitulo(l3));
        System.out.println(l1.mismoTitulo(a));
        System.out.println(l1.mismoTitulo(null));
    }
}