import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPrenotazioneCinema {

    // Classe per rappresentare una prenotazione
    static class Prenotazione {
        String nomeCliente;
        int riga;
        int colonna;

        public Prenotazione(String nomeCliente, int riga, int colonna) {
            this.nomeCliente = nomeCliente;
            this.riga = riga;
            this.colonna = colonna;
        }

        @Override
        public String toString() {
            return "Cliente: " + nomeCliente + " (Riga: " + riga + ", Colonna: " + colonna + ")";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista di prenotazioni
        ArrayList<Prenotazione> prenotazioni = new ArrayList<>();

        // Dimensioni della sala
        int righe = 5, colonne = 10;

        boolean running = true;

        while (running) {
            // Menu principale
            System.out.println("\n--- Sistema di Prenotazione Cinema ---");
            System.out.println("1. Prenota un posto");
            System.out.println("2. Cerca prenotazioni per nome");
            System.out.println("3. Visualizza stato della sala");
            System.out.println("4. Annulla una prenotazione");
            System.out.println("5. Esci");
            System.out.print("Scegli un'opzione: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma la nuova riga

            switch (scelta) {
                case 1:
                    // Prenotazione di un posto
                    System.out.println("Prenotazione:");
                    System.out.print("Inserisci il numero di riga (0-" + (righe - 1) + "): ");
                    int riga = scanner.nextInt();
                    System.out.print("Inserisci il numero di colonna (0-" + (colonne - 1) + "): ");
                    int colonna = scanner.nextInt();
                    scanner.nextLine(); // Consuma la nuova riga

                    if (isValidSeat(riga, colonna, righe, colonne)) {
                        if (isSeatFree(riga, colonna, prenotazioni)) {
                            System.out.print("Inserisci il nome del cliente: ");
                            String nome = scanner.nextLine();
                            prenotazioni.add(new Prenotazione(nome, riga, colonna));
                            System.out.println("Posto prenotato con successo!");
                        } else {
                            System.out.println("Il posto è già prenotato!");
                        }
                    } else {
                        System.out.println("Posto non valido!");
                    }
                    break;

                case 2:
                    // Cerca prenotazioni per nome
                    System.out.print("Inserisci il nome del cliente da cercare: ");
                    String nomeCercato = scanner.nextLine();
                    boolean trovato = false;

                    for (Prenotazione p : prenotazioni) {
                        if (p.nomeCliente.equalsIgnoreCase(nomeCercato)) {
                            System.out.println(p);
                            trovato = true;
                        }
                    }

                    if (!trovato) {
                        System.out.println("Nessuna prenotazione trovata per " + nomeCercato);
                    }
                    break;

                case 3:
                    // Visualizza lo stato della sala
                    System.out.println("\nStato della sala:");
                    for (int i = 0; i < righe; i++) {
                        for (int j = 0; j < colonne; j++) {
                            if (isSeatFree(i, j, prenotazioni)) {
                                System.out.print("[Libero] ");
                            } else {
                                System.out.print("[Prenotato] ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    // Annulla una prenotazione
                    System.out.println("Annullamento Prenotazione:");
                    System.out.print("Inserisci il numero di riga (0-" + (righe - 1) + "): ");
                    int rigaAnnulla = scanner.nextInt();
                    System.out.print("Inserisci il numero di colonna (0-" + (colonne - 1) + "): ");
                    int colonnaAnnulla = scanner.nextInt();

                    if (isValidSeat(rigaAnnulla, colonnaAnnulla, righe, colonne)) {
                        Prenotazione daRimuovere = null;
                        for (Prenotazione p : prenotazioni) {
                            if (p.riga == rigaAnnulla && p.colonna == colonnaAnnulla) {
                                daRimuovere = p;
                                break;
                            }
                        }
                        if (daRimuovere != null) {
                            prenotazioni.remove(daRimuovere);
                            System.out.println("Prenotazione annullata con successo!");
                        } else {
                            System.out.println("Il posto non è prenotato!");
                        }
                    } else {
                        System.out.println("Posto non valido!");
                    }
                    break;

                case 5:
                    // Esci
                    running = false;
                    System.out.println("Grazie per aver usato il sistema di prenotazione!");
                    break;

                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }

        scanner.close();
    }

    // Metodo per controllare se un posto è valido
    private static boolean isValidSeat(int riga, int colonna, int righe, int colonne) {
        return riga >= 0 && riga < righe && colonna >= 0 && colonna < colonne;
    }

    // Metodo per controllare se un posto è libero
    private static boolean isSeatFree(int riga, int colonna, ArrayList<Prenotazione> prenotazioni) {
        for (Prenotazione p : prenotazioni) {
            if (p.riga == riga && p.colonna == colonna) {
                return false;
            }
        }
        return true;
    }
}
