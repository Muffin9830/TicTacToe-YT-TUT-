import java.util.Scanner;

public class TicTacToe {
    private static String[][] spielfeld = new String[3][3];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Spielen wir eine Runde TicTacToe!");
        spielfeld();
        steuerung();

    }

    private static void spielfeld() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int i1 = 0; i1 < spielfeld.length; i1++) {
                spielfeld[i][i1] = ".";
            }
        }
        for (int i = 0; i < spielfeld.length; i++) {
            for (int i1 = 0; i1 < spielfeld.length; i1++) {
                System.out.print(spielfeld[i][i1] + "\t");
            }
            System.out.println();
        }
    }

    public static void printStatus() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int i1 = 0; i1 < spielfeld.length; i1++) {
                System.out.print(spielfeld[i][i1] + "\t");
            }
            System.out.println();
        }
    }

    private static void steuerung() {
        boolean läuft = true;
        boolean game = true;

        while (läuft) {
            if (game) {
                System.out.println("Spieler X ist dran!");
                System.out.println("Gebe eine Koordinate von A0 - C2 an um dein X zu setzen!");
                String field = scanner.nextLine();
                switch (field) {
                    case "A0":
                        spielfeld[0][0] = "x";
                        break;
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
                                "Achte auf die Schreibweise.");
                        break;
                }
                printStatus();
                game = false;
            } else {
                System.out.println("Spieler O ist dran!");
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

            if(spielfeld[0][0] == "x"  && spielfeld[0][1] == "x" && spielfeld[0][2] == "x"){
                System.out.println("X hat gewonnen!");
                läuft = false;
            }else if(spielfeld[0][0] == "o"  && spielfeld[0][1] == "o" && spielfeld[0][2] == "o"){
                System.out.println("O hat gewonnen!");
                läuft = false;
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
