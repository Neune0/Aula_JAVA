public class Metodi_J {
    
    public static void main(String[] args) {
        // Esempio 1: Funzione senza parametri
        saluta();
        
        // Esempio 2: Funzione con parametri che restituisce un valore (somma)
        int risultatoSomma = somma(10, 20);
        System.out.println("Esempio 2: Somma di 10 e 20 = " + risultatoSomma);
        
        // Esempio 3: Funzione che concatena due stringhe
        String concatenazione = concatena("Ciao, ", "mondo!");
        System.out.println("Esempio 3: " + concatenazione);
        
        // Esempio 4: Funzioni sovraccaricate per la moltiplicazione
        int prodottoInt = moltiplica(3, 4);
        double prodottoDouble = moltiplica(3.5, 2.0);
        System.out.println("Esempio 4: Prodotto (int): " + prodottoInt);
        System.out.println("Esempio 4: Prodotto (double): " + prodottoDouble);
        
        // Esempio 5: Funzione ricorsiva per il calcolo del fattoriale
        int fattoriale5 = fattoriale(5);
        System.out.println("Esempio 5: Fattoriale di 5 = " + fattoriale5);
    }
    
    // Funzione senza parametri che stampa un saluto
    public static void saluta() {
        System.out.println("Esempio 1: Ciao a tutti!");
    }
    
    // Funzione con parametri che restituisce la somma di due numeri interi
    public static int somma(int a, int b) {
        return a + b;
    }
    
    // Funzione che concatena due stringhe e restituisce il risultato
    public static String concatena(String s1, String s2) {
        return s1 + s2;
    }
    
    // Funzione sovraccaricata per moltiplicare due numeri interi
    public static int moltiplica(int a, int b) {
        return a * b;
    }
    
    // Funzione sovraccaricata per moltiplicare due numeri double
    public static double moltiplica(double a, double b) {
        return a * b;
    }
    
    // Funzione ricorsiva per calcolare il fattoriale di un numero
    public static int fattoriale(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fattoriale(n - 1);
    }
}
