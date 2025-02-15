import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Ristorante {
    protected String nome;
    protected String email;
    protected float soldi;
    protected ArrayList<String> piatti = new ArrayList<>();
    protected ArrayList<Integer> valutazioni = new ArrayList<>();

    public Ristorante(String nome, String email, float soldi) {
        this.nome = nome;
        this.email = email;
        this.soldi = soldi;
    }

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

    public void visualizzaProfilo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Crediti: " + soldi);
    }
}

class Chef extends Ristorante {
    public Chef(String nome, String email, float soldi) {
        super(nome, email, soldi);
    }

    @Override
    public void aggiungiPiatto(String piatto) {
        super.aggiungiPiatto(piatto);
        System.out.println("Piatto aggiunto: " + piatto);
    }
}

class Critico extends Ristorante {
    public Critico(String nome, String email, float soldi) {
        super(nome, email, soldi);
    }

    public void aggiungiValutazione(int valutazione) {
        super.aggiungiValutazione(valutazione);
        System.out.println("Valutazione aggiunta: " + valutazione);
    }
}

public class EreditarietaRistorante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Ristorante> utenti = new ArrayList<>();

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
                    Ristorante utente = new Ristorante(nome, email, soldi);
                    utenti.add(utente);
                    System.out.println("Utente creato con successo!");
                    break;
                case 2:
                    for (Ristorante u : utenti) {
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
                    chef.aggiungiPiatto(piatto);
                    utenti.add(chef);
                    break;
                case 4:
                    System.out.print("Nome Critico: ");
                    nome = scanner.nextLine();
                    System.out.print("Email Critico: ");
                    email = scanner.nextLine();
                    Critico critico = new Critico(nome, email, random.nextFloat() * 100);
                    System.out.print("Valutazione (1-5): ");
                    int valutazione = scanner.nextInt();
                    critico.aggiungiValutazione(valutazione);
                    utenti.add(critico);
                    break;
                case 5:
                    if (!utenti.isEmpty() && utenti.get(0) instanceof Ristorante) {
                        ((Ristorante) utenti.get(0)).visualizzaMenu();
                    } else {
                        System.out.println("Nessun menu disponibile.");
                    }
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
