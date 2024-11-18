import java.util.ArrayList;
import java.util.Scanner;

public class SpedizionePenne {

    // ArrayList di array per gestire le spedizioni
    ArrayList<int[]> spedizioni = new ArrayList<>();

    public static void main(String[] args) {
        SpedizionePenne gestione = new SpedizionePenne();
        gestione.menuPrincipale();
    }

    // Menu principale per l'interazione con l'utente
    public void menuPrincipale() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Sistema di Gestione Spedizioni Penne ---");
            System.out.println("1. Aggiungi una spedizione");
            System.out.println("2. Visualizza tutte le spedizioni");
            System.out.println("3. Calcola totale penne per colore");
            System.out.println("4. Cerca spedizioni con un determinato colore");
            System.out.println("5. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    aggiungiSpedizione();
                    break;
                case 2:
                    visualizzaSpedizioni();
                    break;
                case 3:
                    calcolaTotalePenne();
                    break;
                case 4:
                    cercaPerColore();
                    break;
                case 5:
                    running = false;
                    System.out.println("Grazie per aver usato il sistema di gestione delle spedizioni!");
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }
        scanner.close();
    }

    // Metodo per aggiungere una spedizione
    public void aggiungiSpedizione() {
        Scanner scanner = new Scanner(System.in);
        int[] nuovaSpedizione = new int[4];

        System.out.println("\nAggiungi una nuova spedizione di penne.");
        System.out.print("Inserisci il numero di penne Rosse: ");
        nuovaSpedizione[0] = scanner.nextInt();

        System.out.print("Inserisci il numero di penne Blu: ");
        nuovaSpedizione[1] = scanner.nextInt();

        System.out.print("Inserisci il numero di penne Verdi: ");
        nuovaSpedizione[2] = scanner.nextInt();

        System.out.print("Inserisci il numero di penne Nere: ");
        nuovaSpedizione[3] = scanner.nextInt();

        spedizioni.add(nuovaSpedizione);
        System.out.println("Spedizione aggiunta con successo!");
    }

    // Metodo per visualizzare tutte le spedizioni
    public void visualizzaSpedizioni() {
        System.out.println("\n--- Visualizzazione delle Spedizioni ---");
        if (spedizioni.isEmpty()) {
            System.out.println("Non ci sono spedizioni registrate.");
        } else {
            for (int i = 0; i < spedizioni.size(); i++) {
                int[] spedizione = spedizioni.get(i);
                System.out.println("Spedizione " + (i + 1) + ": Rosse: " + spedizione[0] + ", Blu: " + spedizione[1] + ", Verdi: " + spedizione[2] + ", Nere: " + spedizione[3]);
            }
        }
    }

    // Metodo per calcolare il totale delle penne per ogni colore
    public void calcolaTotalePenne() {
        int[] totali = new int[4];

        for (int[] spedizione : spedizioni) {
            totali[0] += spedizione[0]; // Penne Rosse
            totali[1] += spedizione[1]; // Penne Blu
            totali[2] += spedizione[2]; // Penne Verdi
            totali[3] += spedizione[3]; // Penne Nere
        }

        System.out.println("\n--- Totale Penne per Colore ---");
        System.out.println("Rosse: " + totali[0]);
        System.out.println("Blu: " + totali[1]);
        System.out.println("Verdi: " + totali[2]);
        System.out.println("Nere: " + totali[3]);
    }

    // Metodo per cercare spedizioni che contengono almeno una penna di un determinato colore
    public void cercaPerColore() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Ricerca Spedizioni per Colore ---");
        System.out.println("Scegli il colore da cercare:");
        System.out.println("1. Rosse");
        System.out.println("2. Blu");
        System.out.println("3. Verdi");
        System.out.println("4. Nere");
        System.out.print("Scegli un'opzione: ");
        int coloreScelto = scanner.nextInt();

        if (coloreScelto < 1 || coloreScelto > 4) {
            System.out.println("Opzione non valida.");
            return;
        }

        boolean trovato = false;
        for (int i = 0; i < spedizioni.size(); i++) {
            int[] spedizione = spedizioni.get(i);
            if (spedizione[coloreScelto - 1] > 0) {
                System.out.println("Spedizione " + (i + 1) + " contiene penne del colore scelto.");
                trovato = true;
            }
        }

        if (!trovato) {
            System.out.println("Nessuna spedizione trovata con penne del colore scelto.");
        }
    }
}

