import java.util.Scanner;

public class Esempio_struttura{

    public static void main(String[] args) {
        
        // qui creo gli scanner
        Scanner Scan_string = new Scanner(System.in);
        Scanner Scan_Num = new Scanner(System.in);

        // inizio ciclo e boolenao di controllo
        boolean controllo = true;
        while (controllo) {

          System.out.println("sono nel ciclo");








          


          // condizione di chiusura del ciclo booleano
          System.out.println("svuoi continuare? si/no");
          String scelta = Scan_string.nextLine();
          if (scelta.equals("no")) {
            break;
          }
        
        }






        // qui chiudo gli scanner
        Scan_Num.close();
        Scan_string.close();
    }
}