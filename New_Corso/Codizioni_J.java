public class Codizioni_J {
    
    public static void main(String[] args) {
        // Esempio 1: Condizione semplice (if)
        int a = 5;
        if (a > 3) {
            System.out.println("Esempio 1: a è maggiore di 3");
        }
        
        // Esempio 2: if-else
        int b = 2;
        if (b > 3) {
            System.out.println("Esempio 2: b è maggiore di 3");
        } else {
            System.out.println("Esempio 2: b non è maggiore di 3");
        }
        
        // Esempio 3: if-else if-else
        int c = 7;
        if (c < 5) {
            System.out.println("Esempio 3: c è minore di 5");
        } else if (c == 5) {
            System.out.println("Esempio 3: c è uguale a 5");
        } else {
            System.out.println("Esempio 3: c è maggiore di 5");
        }
        
        // Esempio 4: Operatore ternario
        int d = 10;
        String risultato = (d % 2 == 0) ? "Esempio 4: d è pari" : "Esempio 4: d è dispari";
        System.out.println(risultato);
        
        // Esempio 5: switch-case
        int giorno = 3;  // Supponiamo: 1=Lunedì, 2=Martedì, ..., 7=Domenica
        switch (giorno) {
            case 1:
                System.out.println("Esempio 5: Lunedì");
                break;
            case 2:
                System.out.println("Esempio 5: Martedì");
                break;
            case 3:
                System.out.println("Esempio 5: Mercoledì");
                break;
            case 4:
                System.out.println("Esempio 5: Giovedì");
                break;
            case 5:
                System.out.println("Esempio 5: Venerdì");
                break;
            case 6:
                System.out.println("Esempio 5: Sabato");
                break;
            case 7:
                System.out.println("Esempio 5: Domenica");
                break;
            default:
                System.out.println("Esempio 5: Giorno non valido");
                break;
        }
        
        // Esempio 6: If annidato
        int x = 10, y = 20;
        if (x < y) {
            if (y < 30) {
                System.out.println("Esempio 6: x è minore di y e y è minore di 30");
            } else {
                System.out.println("Esempio 6: x è minore di y ma y non è minore di 30");
            }
        } else {
            System.out.println("Esempio 6: x non è minore di y");
        }



        
    }
}
