package com.biblioteca;

public class Biblioteca {

    private Libro[] catalogo;
    private int dimensione;


    public Libro[] getCatalogo() {
        return catalogo;
    }

    public int getDimensione() {
        return dimensione;
    }

    public Biblioteca() {
        catalogo = new Libro[50];
        dimensione = 0;
    }

    public void aggiungiLibro(Libro l) {
        if (dimensione < catalogo.length) {
            catalogo[dimensione] = l;
            dimensione++;
        } else {
            System.out.println("Catalogo pieno, impossibile aggiungere il libro.");
        }
    }

    public void mostraCatalogo() {
        for (int i = 0; i < dimensione; i++) {
            Libro libro = catalogo[i];
            System.out.println(libro.toString());
            if (libro.isClassico()) {
                System.out.println("- È un classico.");
            }
            if (libro instanceof LibroDigitale) {
                LibroDigitale digitale = (LibroDigitale) libro;
                if (digitale.isPesante()) {
                    System.out.println("- È un libro digitale pesante.");
                }
            }
            System.out.println("------------------------------");
        }
    }
    

    public int contaClassici() {
        int count = 0;
        for (int i = 0; i < dimensione; i++) {
            if (catalogo[i].isClassico()) {
                count++;
            }
        }
        return count; // Restituisce il numero di libri classici
    }
}