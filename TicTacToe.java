import java.util.Scanner;

public class TicTacToe {
    private static String[][] spielfeld = new String[3][3];     //2 dimmensionales string array mit der größe 3x3
    private static Scanner scanner = new Scanner(System.in);    //soll das spielfeld werden

    public static void main(String[] args) {

        System.out.println("Spielen wir eine Runde TicTacToe!");//main methode mit einem sysout zum spielbeginn
        spielfeld();                                            //aufruf methode spielfeld die das spielfeld ausgeben soll
        steuerung();                                            //aufruf der methode steuerung die das hauptspiel darstellt

    }

    private static void spielfeld() {
        for (int i = 0; i < spielfeld.length; i++) {            //for schleife druckt spielfeld aus punkten aus
            for (int i1 = 0; i1 < spielfeld.length; i1++) {     //erste schleife greift auf das äußere (erste) array zu zweite schleife
                spielfeld[i][i1] = ".";                         //greift aufs innere array zu und befüllt sie jeweils mit punkten
            }
        }
        for (int i = 0; i < spielfeld.length; i++) {            //hier wird das array das grade befüllt wurde auf die selbe weise
            for (int i1 = 0; i1 < spielfeld.length; i1++) {     //ausgelesen und mit einem sysout ausgegeben
                System.out.print(spielfeld[i][i1] + "\t");      // \t setzt dabei einen tab nach jedem punkt ein
            }
            System.out.println();                               //dieser sysout fügt eine leerzeile nach jedem durchlauf der inneren
        }                                                       //schleife ein und sorgt so dafür dass die punkte in 3 reihen untereinander und
    }                                                           //nicht hintereinander weg ausgegeben werden

    public static void printStatus() {
        for (int i = 0; i < spielfeld.length; i++) {            //die printStatus methode soll das spielfeld immer neu ausdrucken ohne
            for (int i1 = 0; i1 < spielfeld.length; i1++) {     //das die eingaben überschrieben werden
                System.out.print(spielfeld[i][i1] + "\t");      //funktioniert genau wie die spielfeld methode aber hier ist nur die zweite
            }                                                   //for schleife zum ausgeben und nicht die zum befüllen drin
            System.out.println();
        }
    }

    private static void steuerung() {
        boolean läuft = true;                                   //bool für die whileschleife um diese bis spielende am laufen zu halten
        boolean game = true;                                    //bool für den wechsel von spieler x zu spieler o

        while (läuft) {                                         //while schleife die dafür sorgt dass das spiel läuft/der code des spiels sich
            if (game) {                                         //wiederholt
                System.out.println("Spieler X ist dran!");      //if statement mit bool game was immer aufgerufen wird wenn game=true ist und
                System.out.println("Gebe eine Koordinate von A0 - C2 an um dein X zu setzen!");
                String field = scanner.nextLine();              //so spieler x zum spielen auffordert
                switch (field) {                                //switch case mit String field welcher durch den scanner vom user eingegeben
                    case "A0":                                  //werden kann
                        spielfeld[0][0] = "x";                  //jeh nachdem welche koordinate eingetippt wird wird jeweils für diese stelle im
                        break;                                  //array der wert von . auf x gesetzt und so ein zug gemacht
                    case "A1":
                        spielfeld[0][1] = "x";
                        break;
                    case "A2":
                        spielfeld[0][2] = "x";
                        break;
                    case "B0":
                        spielfeld[1][0] = "x";
                        break;
                    case "B1":
                        spielfeld[1][1] = "x";
                        break;
                    case "B2":
                        spielfeld[1][2] = "x";
                        break;
                    case "C0":
                        spielfeld[2][0] = "x";
                        break;
                    case "C1":
                        spielfeld[2][1] = "x";
                        break;
                    case "C2":
                        spielfeld[2][2] = "x";
                        break;
                    default:
                        System.out.println("Falsche Eingabe! Nur A0 bis C2 möglich. \n" +
                                "Achte auf die Schreibweise."); //sollte ein falscher wert eingegeben werden wird diese Nachricht ausgegeben
                        break;                                  //aktuell ist dann spieler o dran das muss noch irgendwie verbessert werden
                }
                printStatus();                                  //hier wird das feld dann neu ausgegeben mit dem neu eingetragenen x
                game = false;                                   //nach dem zug wird game auf false gesetzt
            } else {                                            //nun trift else zu und spieler o ist dran der inhalt von
                System.out.println("Spieler O ist dran!");      //els ist identisch außer das hier o statt x verwendet wird
                System.out.println("Gebe eine Koordinate von A0 - C2 an um dein O zu setzen!");
                String field = scanner.nextLine();
                switch (field) {
                    case "A0":
                        spielfeld[0][0] = "o";
                        break;
                    case "A1":
                        spielfeld[0][1] = "o";
                        break;
                    case "A2":
                        spielfeld[0][2] = "o";
                        break;
                    case "B0":
                        spielfeld[1][0] = "o";
                        break;
                    case "B1":
                        spielfeld[1][1] = "o";
                        break;
                    case "B2":
                        spielfeld[1][2] = "o";
                        break;
                    case "C0":
                        spielfeld[2][0] = "o";
                        break;
                    case "C1":
                        spielfeld[2][1] = "o";
                        break;
                    case "C2":
                        spielfeld[2][2] = "o";
                        break;
                    default:
                        System.out.println("Falsche Eingabe! Nur A0 bis C2 möglich. \n" +
                                "Achte auf die Schreibweise.");
                        break;
                }
                printStatus();
                game = true;
            }

            if(spielfeld[0][0] == "x"  && spielfeld[0][1] == "x" && spielfeld[0][2] == "x"){    //nach jedem zug wird einmal überprüft ob eine
                System.out.println("X hat gewonnen!");                                      //reihe im feld mit x oder o ausgefüllt ist
                läuft = false;                                                              //ist dies der fall wird läuft auf false gesetzt und
            }else if(spielfeld[0][0] == "o"  && spielfeld[0][1] == "o" && spielfeld[0][2] == "o"){//das spiel ist vorbei
                System.out.println("O hat gewonnen!");                                      //jeh nachdem ob x oder o die reihe voll gemacht hat
                läuft = false;                                                              //kommt die ausgabe X/O hat gewonnen
            }else if(spielfeld[1][0] == "x"  && spielfeld[1][1] == "x" && spielfeld[1][2] == "x"){
                System.out.println("X hat gewonnen!");
                läuft = false;
            }else if(spielfeld[1][0] == "o"  && spielfeld[1][1] == "o" && spielfeld[1][2] == "o"){
                System.out.println("O hat gewonnen!");
                läuft = false;
            }else if(spielfeld[2][0] == "x"  && spielfeld[2][1] == "x" && spielfeld[2][2] == "x"){
                System.out.println("X hat gewonnen!");
                läuft = false;
            }else if(spielfeld[2][0] == "o"  && spielfeld[2][1] == "o" && spielfeld[2][2] == "o"){
                System.out.println("O hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][0] == "x"  && spielfeld[1][1] == "x" && spielfeld[2][2] == "x"){
                System.out.println("X hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][0] == "o"  && spielfeld[1][1] == "o" && spielfeld[2][2] == "o"){
                System.out.println("O hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][2] == "x"  && spielfeld[1][1] == "x" && spielfeld[2][0] == "x"){
                System.out.println("X hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][2] == "o"  && spielfeld[1][1] == "o" && spielfeld[2][0] == "o"){
                System.out.println("O hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][0] == "x"  && spielfeld[1][0] == "x" && spielfeld[2][0] == "x"){
                System.out.println("X hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][0] == "o"  && spielfeld[1][0] == "o" && spielfeld[2][0] == "o"){
                System.out.println("O hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][1] == "x"  && spielfeld[1][1] == "x" && spielfeld[2][1] == "x"){
                System.out.println("X hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][1] == "o"  && spielfeld[1][1] == "o" && spielfeld[2][1] == "o"){
                System.out.println("O hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][2] == "x"  && spielfeld[1][2] == "x" && spielfeld[2][2] == "x"){
                System.out.println("X hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][2] == "o"  && spielfeld[1][2] == "o" && spielfeld[2][2] == "o"){
                System.out.println("O hat gewonnen!");
                läuft = false;
            }

        }

    }
}
