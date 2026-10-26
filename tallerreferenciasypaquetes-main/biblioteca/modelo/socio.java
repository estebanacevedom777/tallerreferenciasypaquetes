package biblioteca.modelo;

public class socio {

    private String nombre;
    private int librosPrestados;

    public socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(libro unLibro) {
        if (unLibro == null) {
            System.out.println("No hay libro para prestar");
        } else if (!unLibro.estaDisponible()) {
            System.out.println(unLibro.getTitulo() + " no está disponible");
        } else {
            unLibro.prestar();
            librosPrestados++;
            System.out.println(nombre + " recibió " + unLibro.getTitulo());
        }
    }
}