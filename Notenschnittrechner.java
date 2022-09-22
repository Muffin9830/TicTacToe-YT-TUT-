import java.util.Scanner;

public class Notenschnittrechner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value;
        int j;
        double schnitt = 0;

        System.out.println("Wie viele Noten möchtest du eingeben?");
        j = scanner.nextInt();                              //hier bekommt die variable j ihren wert nachdem gefragt wurde wie viele noten
        int[] noten = new int[j];                           //zusammengerechnet werden sollen das int array bekommt dadurch seine länge
        for(int i = 0; i < noten.length; i++) {             //die forschleife in der mann seine noten eingibt läuft dann so oft durch wie
            System.out.println("Bitte gib eine Note ein:"); //das int array lang ist daher kann man nur die zahl noten eingeben die vorher
            value = scanner.nextInt();                      //festgelegt wurde für value wird hier durch den scanner ein wert eingegeben
            switch (value) {                                //dabei soll es sich um eine der noten handeln
                case 1:                                     //switch case überprüft nun den notenwert und schreibt den betrag ins array
                    noten[i] += 1;                          //dies geschieht an stelle i welche dem durchlauf der forschleife entspricht
                    break;
                case 2:
                    noten[i] += 2;
                    break;
                case 3:
                    noten[i] += 3;
                    break;
                case 4:
                    noten[i] += 4;
                    break;
                case 5:
                    noten[i] += 5;
                    break;
                case 6:
                    noten[i] += 6;
                    break;
                default:
                    System.out.println("Ungültige Eingabe! Nur Noten von 1-6 möglich.");
            }                                              //bei falscher eingabe erscheint diese nachricht
            schnitt = schnitt + noten[i];                  //am ende des durchlaufs wird dem schnitt der notenwert zugerechnet
        }
        schnitt = schnitt / noten.length;                  //sind alle noten eingegeben wird schnitt welcher hier die summe aller noten ist
        System.out.println("Der Notendurchschnitt ist: " + schnitt); //durch die anzahl der noten geteilt um so den schnitt zu erhalten
    }
}
