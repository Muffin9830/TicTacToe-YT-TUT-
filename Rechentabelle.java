public class Rechentabelle {
    public static void main(String[] args) {
        String[][] rechenTafel = new String[10][10];  // erstelllt ein neues 2D int Array mit der größe 10 x 10

        for (int i = 0; i < rechenTafel.length; i++) { //greift auf das äußere array zu bzw. durchläuft es mit i
            for (int i1 = 0; i1 < rechenTafel.length; i1++) { //greift auf das innere array zu bzw. durchläuft es mit i1
                rechenTafel[i][i1] = (i + 1) + (" x ") + (i1 + 1)+ (" = ") + (i + 1) * (i1+ 1); // an der stelle i/i1 soll stehen
            }                                                                                   //(i+1) x (i1+1) = ((i+1) x (i1+1))
        }                                                                                       //also 1x1=1, 1x2=2 ... 2x2=4 usw.
        for (int i = 0; i < rechenTafel.length; i++) {      // liest äußeres array aus
            for (int i1 = 0; i1 < rechenTafel.length; i1++) { //liest inneres array aus
                System.out.print(rechenTafel[i][i1] + "\t"); // gibt die daten an den jeweiligen stellen aus wie sie oben befüllt wurden
            }                                                // \t fügt einen tab ein für schöneres aussehen auf der konsole (gleichmäßiger abstand)
            System.out.println();                            //fügt leere Zeile nach jedem 10ten durchlauf ein um aussehen zu verbessern
            System.out.println();                            //bzw 2 zeilen damit es wie tabelle aussieht
        }
    }
}
