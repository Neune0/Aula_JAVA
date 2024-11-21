import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Utente {
    protected String nome;
    protected String email;
    protected float soldi;

    public Utente(String nome, String email, float soldi) {
        this.nome = nome;
        this.email = email;
        this.soldi = soldi;
    }

    public void visualizzaProfilo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Crediti: " + soldi);
    }
}

class Ristorante {
    protected ArrayList<String> piatti = new ArrayList<>();
    protected ArrayList<Integer> valutazioni = new ArrayList<>();

    public void aggiungiPiatto(String piatto) {
        piatti.add(piatto);
    }

    public void aggiungiValutazione(int valutazione) {
        valutazioni.add(valutazione);
    }

    public void visualizzaMenu() {
        System.out.println("Menu:");
        for (String piatto : piatti) {
            System.out.println("- " + piatto);
        }
    }
}

class Chef extends Utente {
    public Chef(String nome, String email, float soldi) {
        super(nome, email, soldi);
    }

    public void aggiungiPiatto(Ristorante ristorante, String piatto) {
        ristorante.aggiungiPiatto(piatto);
        System.out.println("Piatto aggiunto: " + piatto);
    }
}

class Critico extends Utente {
    public Critico(String nome, String email, float soldi) {
        super(nome, email, soldi);
    }

    public void aggiungiValutazione(Ristorante ristorante, int valutazione) {
        ristorante.aggiungiValutazione(valutazione);
        System.out.println("Valutazione aggiunta: " + valutazione);
    }
}

public class EreditarietaRistorante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Ristorante ristorante = new Ristorante();
        ArrayList<Utente> utenti = new ArrayList<>();

        while (true) {
            System.out.println("1. Crea Utente");
            System.out.println("2. Visualizza Profilo");
            System.out.println("3. Aggiungi Piatto (Chef)");
            System.out.println("4. Aggiungi Valutazione (Critico)");
            System.out.println("5. Visualizza Menu");
            System.out.println("6. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    float soldi = random.nextFloat() * 100; // Crediti randomizzati
                    Utente utente = new Utente(nome, email, soldi);
                    utenti.add(utente);
                    System.out.println("Utente creato con successo!");
                    break;
                case 2:
                    for (Utente u : utenti) {
                        u.visualizzaProfilo();
                    }
                    break;
                case 3:
                    System.out.print("Nome Chef: ");
                    nome = scanner.nextLine();
                    System.out.print("Email Chef: ");
                    email = scanner.nextLine();
                    Chef chef = new Chef(nome, email, random.nextFloat() * 100);
                    System.out.print("Nome piatto da aggiungere: ");
                    String piatto = scanner.nextLine();
                    chef.aggiungiPiatto(ristorante, piatto);
                    break;
                case 4:
                    System.out.print("Nome Critico: ");
                    nome = scanner.nextLine();
                    System.out.print("Email Critico: ");
                    email = scanner.nextLine();
                    Critico critico = new Critico(nome, email, random.nextFloat() * 100);
                    System.out.print("Valutazione (1-5): ");
                    int valutazione = scanner.nextInt();
                    critico.aggiungiValutazione(ristorante, valutazione);
                    break;
                case 5:
                    ristorante.visualizzaMenu();
                    break;
                case 6:
                    System.out.println("Arrivederci!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}
