Esercitazione pratica: Gestione Biblioteca
Crea un progetto Java utilizzando OpenJDK 21 Temurin, Maven e VSCode. Gestisci il codice
tramite Git e condividilo su GitHub.
Obiettivi:
• Utilizzare classi e sottoclassi con attributi privati e metodi specifici.
• Applicare incapsulamento, ereditarietà e polimorfismo.
• Realizzare metodi avanzati, oltre ai classici setter, getter e toString().
• Implementare un metodo main ben strutturato.
Attività:
1. Classe principale (Libro):
– Attributi: titolo (String), autore (String), annoPubblicazione (int).
– Costruttore completo e metodi setter/getter con controlli (es: anno di
pubblicazione valido).
– Metodo toString() per la descrizione di un libro.
– Metodo isClassico() che restituisce true se il libro ha più di 50 anni dalla
pubblicazione.
2. Sottoclasse (LibroDigitale):
– Estende Libro aggiungendo l'attributo privato dimensioneMB (double).
– Metodo aggiuntivo isPesante() che restituisce true se la dimensione è superiore
a 100 MB.

3. Classe di gestione (Biblioteca):
– Attributo: array di 50 elementi di classe Libro.
– Attributo statico: ultima casella occupata dell’array di 50 Libro
– Metodi:
• aggiungiLibro(Libro l): aggiunge libri all'elenco.
• mostraCatalogo(): stampa i dettagli di ogni libro e indica se è classico o,
se digitale, se è pesante.
– Costruttore che richiama quello della classe base.
– Metodo toString() per la descrizione di un libro digitale.
• contaClassici(): restituisce il numero di libri classici presenti nella
biblioteca.

4. Classe principale con metodo main (MainBiblioteca):
– Crea una Biblioteca vuota
– Visualizza un menù con le seguenti opzioni:
• Inserimento di un libro
• Visualizzazione dei libri
• Calcolo del numero totale di classici
• Uscita dal programma
