package com.biblioteca;

import java.util.Objects;

public class LibroDigitale extends Libro {

    private String formato;
    private double dimensioneMB;

    public LibroDigitale(String titolo, String autore, int annoPubblicazione, String formato, double dimensioneMB) {
        super(titolo, autore, annoPubblicazione);
        this.formato = formato;
        this.dimensioneMB = dimensioneMB;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getDimensioneMB() {
        return dimensioneMB;
    }

    public void setDimensioneMB(double dimensioneMB) {
        this.dimensioneMB = dimensioneMB;
    }

    public boolean isPesante() {
        return dimensioneMB > 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Formato: " + formato + "\n" +
               "Dimensione: " + dimensioneMB + " MB";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), formato, dimensioneMB);
    }
}
