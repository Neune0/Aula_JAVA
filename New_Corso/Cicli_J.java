public class Cicli_J {
    public static void main(String[] args) {
        // Esempio 1: Ciclo for - stampa i numeri da 0 a 4
        System.out.println("Esempio 1: Ciclo for");
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero: " + i);
        }
        
        // Esempio 2: Ciclo while - stampa i numeri da 0 a 4
        System.out.println("\nEsempio 2: Ciclo while");
        int j = 0;
        while (j < 5) {
            System.out.println("Numero: " + j);
            j++;
        }
        
        // Esempio 3: Ciclo do-while - stampa i numeri da 0 a 4
        System.out.println("\nEsempio 3: Ciclo do-while");
        int k = 0;
        do {
            System.out.println("Numero: " + k);
            k++;
        } while (k < 5);
        
        // Esempio 4: Ciclo for-each (enhanced for) - iterazione su un array
        System.out.println("\nEsempio 4: Ciclo for-each (enhanced for)");
        int[] arrayNumeri = {10, 20, 30, 40, 50};
        for (int num : arrayNumeri) {
            System.out.println("Numero: " + num);
        }
        
        // Esempio 5: Ciclo for con break e continue
        System.out.println("\nEsempio 5: Ciclo for con break e continue");
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                // Salta il numero 3
                continue;
            }
            if (i == 8) {
                // Interrompe il ciclo quando i raggiunge 8
                break;
            }
            System.out.println("Numero: " + i);
        }

        int prova = 0;

        while(prova > -2){

            if (prova == 0) {
                System.out.println( "sono a  zero");
                
            } else{
                System.out.println( "non sono a  zero");
            }

            prova -=1;
        }
        
        // Esempio 6: Ciclo annidato - tabella di moltiplicazione 3x3
        System.out.println("\nEsempio 6: Ciclo annidato (Tabella di moltiplicazione 3x3)");
        for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 3; n++) {
                System.out.print(m * n + "\t");
            }
            System.out.println();
        }

        boolean controllo = true;

        while (controllo) {
            // primo menu
            boolean controllo2 = true;
            
            while (controllo2) {
                // secondo menu
            }
        }
    }
}
