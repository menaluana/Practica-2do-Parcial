package Entidades;

import java.util.Objects;

public abstract class Soft {
    private String titulo;
    private String creador;
    private Genero genero;
    private int id;
    private static int contador = 0;

    public Soft(String titulo, String creador, Genero genero) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        contador++;
        this.id = contador;
    }
    public Soft() {
        this.titulo = "Nodefinido";
        this.creador = "Nodefinido";
        this.genero = Genero.RPG;
        this.id = 0;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soft soft = (Soft) o;
        return genero == soft.genero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(genero);
    }
}
