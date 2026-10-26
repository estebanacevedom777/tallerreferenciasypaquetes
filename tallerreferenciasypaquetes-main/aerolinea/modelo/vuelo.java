package aerolinea.modelo;

public class vuelo {

    private String codigo;
    private String destino;
    private int sillasDisponibles;

    public vuelo(String codigo, String destino, int sillasDisponibles) {
        this.codigo = codigo;
        this.destino = "Sin destino";      // valor por defecto si el destino es inválido
        setDestino(destino);               // reutiliza la validación del set
        if (sillasDisponibles >= 0) {      // no acepta sillas negativas
            this.sillasDisponibles = sillasDisponibles;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public int getSillasDisponibles() {
        return sillasDisponibles;
    }

    public void setDestino(String destino) {
        if (destino == null || destino.isEmpty()) {
            System.out.println("Destino inválido");
        } else {
            this.destino = destino;
        }
    }

    // No hay set de sillas: solo bajan con reservarSilla()
    public boolean reservarSilla() {
        if (sillasDisponibles > 0) {
            sillasDisponibles--;
            return true;
        }
        return false;
    }
}