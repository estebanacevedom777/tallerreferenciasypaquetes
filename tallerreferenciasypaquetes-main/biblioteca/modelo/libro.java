package biblioteca.modelo;

public class libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public libro(String titulo, String autor) {
        this.titulo = "Sin título";   // valor por defecto si el título es inválido
        setTitulo(titulo);            // reutiliza la validación del set
        this.autor = autor;
        this.disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println(titulo + " de " + autor + " | disponible: " + disponible);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("Título inválido");
        } else {
            this.titulo = titulo;
        }
    }

    // No existe setDisponible: la disponibilidad solo cambia con prestar() y devolver()

    // Reto 3
    public boolean mismoTitulo(libro otro) {
        return otro != null && this.titulo.equals(otro.titulo);
    }
}