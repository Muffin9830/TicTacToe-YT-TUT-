import java.util.Scanner;

public class Zeichenzähler {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte gib einen Satz ein.");
        String satz = scan.nextLine();
        checkScentence(satz);

    }

    private static void checkScentence(String satz) {
        char[] chars = satz.toCharArray();          //erstellt ein char array und befüllt es mit zeichen aus dem String satz
        int gb = 0;                                 //welcher oben erstellt wurde und durch die Nutzereingabe befüllt werden soll
        int kb = 0;                                 //die int variablen sind als Zähler gedacht
        int lz = 0;

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){                    //für den datentyp char müssen die einzelnen Anführungszeichen verwendet werden
                lz++;                               //können im gegensatz zu strings mit == verglichen werden da sie ein primitiver
            }                                       //datentyp sind und ein string eigl eine eigene klasse
            if(Character.isUpperCase(chars[i])){    //das programm überprüft an der stelle i ob ein buchstabe groß klein oder ein leerzeichen
                gb++;                               //ist
            }
            if(Character.isLowerCase(chars[i])){
                kb++;
            }
        }
        System.out.println("Anzahl Großbuchstaben = " + gb);
        System.out.println("Anzahl Kleinbuchstaben = " + kb);
        System.out.println("Anzahl Leerzeichen = " + lz);
    }

}
