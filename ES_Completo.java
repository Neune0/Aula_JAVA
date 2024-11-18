public class Penne {
    // Campi della classe
    private String colore;
    private int quantita;

    // Costruttore
    public Penne(String colore, int quantita) {
        this.colore = colore;
        this.quantita = quantita;
    }

    // Sovrascrittura del metodo toString()
    @Override
    public String toString() {
        return "Penne{" +
                "colore='" + colore + '\'' +
                ", quantita=" + quantita +
                '}';
    }

    // Sovrascrittura del metodo equals() per confrontare oggetti Penne
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Penne penne = (Penne) obj;
        return quantita == penne.quantita && colore.equals(penne.colore);
    }

    // Sovrascrittura del metodo hashCode()
    @Override
    public int hashCode() {
        return colore.hashCode() + quantita;
    }

    public static void main(String[] args) {
        Penne penne1 = new Penne("Blu", 10);
        Penne penne2 = new Penne("Blu", 10);
        Penne penne3 = new Penne("Rosso", 5);

        // Uso del metodo toString()
        System.out.println(penne1);  // Output: Penne{colore='Blu', quantita=10}

        // Uso del metodo equals()
        System.out.println(penne1.equals(penne2));  // Output: true (poiché hanno stesso colore e quantità)
        System.out.println(penne1.equals(penne3));  // Output: false (diverso colore e quantità)

        // Uso del metodo hashCode()
        System.out.println(penne1.hashCode());  // Esempio di valore hash calcolato
        System.out.println(penne2.hashCode());  // Stesso valore di penne1 perché uguali
    }
}
