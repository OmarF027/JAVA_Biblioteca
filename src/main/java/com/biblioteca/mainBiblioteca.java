package com.biblioteca;

public class mainBiblioteca {

    private mainBiblioteca() {
    }

    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Creazione di libri
        Libro libro1 = new Libro("Il Nome della Rosa", "Umberto Eco", 1980);
        Libro libro2 = new Libro("I Promessi Sposi", "Alessandro Manzoni", 1827);
        LibroDigitale libro3 = new LibroDigitale("1984", "George Orwell", 1949, "PDF", 120.5);

        // Aggiunta dei libri alla biblioteca
        biblioteca.aggiungiLibro(libro1);
        biblioteca.aggiungiLibro(libro2);
        biblioteca.aggiungiLibro(libro3);

        // Visualizzazione del catalogo
        System.out.println("=== Catalogo Biblioteca ===");
        biblioteca.mostraCatalogo();

        // Calcolo del numero di classici
        int classici = biblioteca.contaClassici();
        System.out.println("Numero totale di libri classici: " + classici);
    }
}