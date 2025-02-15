// Classe principale per eseguire il programma
public class Main {
    public static void main(String[] args) {
        // Creazione della squadra 1
        Squadra squadra1 = new Squadra("Squadra 1");
        squadra1.generaCalciatori();

        // Creazione della squadra 2
        Squadra squadra2 = new Squadra("Squadra 2");
        squadra2.generaCalciatori();

        // Creazione e gestione di una partita
        Partita partita = new Partita(squadra1, squadra2);
        int risultato = partita.gioca();
        System.out.println("Risultato della partita: " + risultato);
    }
}

// Classe per rappresentare un calciatore
class Calciatore {
    private String nome;
    private String ruolo;

    // Costruttore per inizializzare i dati
    public Calciatore(String nome, String ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }

    // Metodo per ottenere il nome del calciatore
    public String getNome() {
        return nome;
    }

    // Metodo per ottenere il ruolo del calciatore
    public String getRuolo() {
        return ruolo;
    }
}

// Classe per rappresentare una squadra composta da 12 calciatori
class Squadra {
    private String nomeSquadra;
    private Calciatore[] calciatori;

    // Costruttore per inizializzare la squadra
    public Squadra(String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
        this.calciatori = new Calciatore[12];
    }

    // Metodo per generare 12 calciatori con nomi e ruoli casuali
    public void generaCalciatori() {
        String[] nomi = {"Mario", "Luigi", "Paolo", "Marco", "Luca", "Giovanni", "Alessandro", "Gabriele", "Filippo", "Andrea", "Matteo", "Stefano"};
        String[] ruoli = {"Portiere", "Difensore", "Centrocampista", "Attaccante"};

        for (int i = 0; i < calciatori.length; i++) {
            String nome = nomi[i];
            String ruolo = ruoli[i % ruoli.length];
            calciatori[i] = new Calciatore(nome, ruolo);
        }
    }

    // Metodo per ottenere il nome della squadra
    public String getNomeSquadra() {
        return nomeSquadra;
    }

    // Metodo per ottenere i calciatori
    public Calciatore[] getCalciatori() {
        return calciatori;
    }
}

// Classe per rappresentare una partita
class Partita {
    private Squadra squadra1;
    private Squadra squadra2;

    // Costruttore per inizializzzare la partita con due squadre
    public Partita(Squadra squadra1, Squadra squadra2) {
        this.squadra1 = squadra1;
        this.squadra2 = squadra2;
    }

    // Metodo per simulare la parttita e generare un risultato casuale
    public int gioca() {
        // Simulazione del risultato casuale (1 per squadra 1, 2 per squadra 2, 0 per pareggio)
        int risultato = (int) (Math.random() * 3);
        switch (risultato) {
            case 1:
                System.out.println(squadra1.getNomeSquadra() + " ha vinto!");
                break;
            case 2:
                System.out.println(squadra2.getNomeSquadra() + " ha vinto!");
                break;
            default:
                System.out.println("La partita è finita in pareggio!");
                break;
        }
        return risultato;
    }
}
