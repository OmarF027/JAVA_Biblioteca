package com.biblioteca;

import java.time.Year;
import java.util.Objects;

public class Libro {

        private String titolo;
        private String autore;
        private int annoPubblicazione;
    
        public Libro(){}
    
        public Libro(String t, String a, int ap){
            titolo = t;
            autore = a;
            annoPubblicazione = ap;
        }
        
// Setters and Getters
public void setannoPubblicazione(int annoPubblicazione) {
    this.annoPubblicazione = annoPubblicazione;
}
public int getannoPubblicazione() {
    return annoPubblicazione;
}   
public void setautore(String autore) {
    this.autore = autore;
}
public String getautore() {
    return autore;
}
public void setitolo(String titolo) {
    this.titolo = titolo;
}
public String getitolo() {
    return titolo;

}

public String toString(){
    return "Titolo: " + titolo + "\n" +
           "Autore: " + autore + "\n" +
           "Anno di pubblicazione: " + annoPubblicazione;
} 

 public boolean isClassico() {
        int annoCorrente = Year.now().getValue();
        return annoCorrente - annoPubblicazione > 50;
    }

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Libro libro = (Libro) obj;
    return annoPubblicazione == libro.annoPubblicazione &&
           titolo.equals(libro.titolo) &&
           autore.equals(libro.autore);
        }

@Override 
public int hashCode() {
    return Objects.hash(titolo, autore, annoPubblicazione);
}

}