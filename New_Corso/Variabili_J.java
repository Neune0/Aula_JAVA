public class Variabili_J {
    
    // Variabili di istanza (per eventuali usi futuri)
    int numeroIstanza = 100;
    String testoIstanza = "Variabile di istanza";
    
    // Variabile statica
    static double piGreco = 3.14159;
    
    public static void main(String[] args) {

        //Variabili_J oggetto = new Variabili_J();
        
        // Variabili locali di tipo primitivo
        int numeroIntero = 42;
        double numeroDecimale = 3.14;
        char carattere = 'A';
        boolean flag = true;
        
        // Variabile di tipo String 
        String saluto = "Ciao, mondo!";
        
        // Variabile finale (costante)
        final int COSTANTE = 10;
        
        // Stampa delle variabili locali
        System.out.println("Numero intero: " + numeroIntero);
        System.out.println("Numero decimale: " + numeroDecimale);
        System.out.println("Carattere: " + carattere);
        System.out.println("Booleano: " + flag);
        System.out.println("Stringa: " + saluto);
        System.out.println("Costante (final): " + COSTANTE);
        
        // Uso della variabile statica
        System.out.println("Valore di piGreco (statico): " + piGreco);
        
        // Esempio di dichiarazione e inizializzazione di un array
        int[] arrayNumeri = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int numero : arrayNumeri) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        // Operazioni con variabili: incremento e assegnazione
        int a = 5;
        System.out.println("Valore di a prima: " + a);
        a = a + 2; // incremento
        System.out.println("Valore di a dopo incremento: " + a);
        
        // Concatenazione di variabili di tipi diversi
        String nome = "Marco";
        int eta = 30;
        System.out.println("Concatenazione: " + nome + " ha " + eta + " anni.");
        
        // Esempio di variabili wrapper (autoboxing)
        Integer numWrapper = 15;
        System.out.println("Variabile wrapper: " + numWrapper);
    }
}

