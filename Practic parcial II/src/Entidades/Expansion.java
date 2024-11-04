package Entidades;

public class Expansion extends Soft {
    private String fechaLanzamiento;

    public Expansion(String titulo, String creador, Genero genero, String fechaLanzamiento) {
        super(titulo, creador, genero);
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Expansion() {
        this.fechaLanzamiento = "fechaLanzamiento";
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Entidades.Expansion{" +
                "fechaLanzamiento='" + fechaLanzamiento + '\'' +
                '}';
    }
}
