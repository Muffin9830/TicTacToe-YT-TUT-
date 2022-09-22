import java.util.Scanner;

public class Notenschnittrechner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value;
        int j;
        double schnitt = 0;

        System.out.println("Wie viele Noten möchtest du eingeben?");
        j = scanner.nextInt();
        int[] noten = new int[j];
        for(int i = 0; i < noten.length; i++) {
            System.out.println("Bitte gib eine Note ein:");
            value = scanner.nextInt();
            switch (value) {
                case 1:
                    noten[i] += 1;
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
            }
            schnitt = schnitt + noten[i];
        }
        schnitt = schnitt / noten.length;
        System.out.println("Der Notendurchschnitt ist: " + schnitt);
    }
}
