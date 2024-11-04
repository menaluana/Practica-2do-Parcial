package Entidades;

import JSON.MetodosJSON;

public class Juego extends Soft {
    private int numeroVersion;

    public Juego(String titulo, String creador, Genero genero, int numeroVersion) {
        super(titulo, creador, genero);
        this.numeroVersion = numeroVersion;
    }

    public Juego() {
        this.numeroVersion = 0;
    }

    public int getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(int numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

    @Override
    public String toString() {
        return "Entidades.Juego{" +
                "numeroVersion=" + numeroVersion +
                '}';
    }
}
