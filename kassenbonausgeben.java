public class kassenbonausgeben {
    static double wurstpreis = 1.2;                 //doubles die den preis der produkte enthalten
    static double kaesepreis = 1.4;
    static double milchpreis = 0.8;
    static double kaffepreis = 2;
    static double hundefutterpreis = 15;
    static String wurst = "Wurst";          //strings die namen der produkte enthalten
    static String kaese = "Käse ";
    static String milch = "Milch";
    static String kaffe = "Kaffe";
    static String hundefutter = "Hundefutter";
    static int[] anzahl ={1,3,5,1,1};       //array das die anzahl der produkte an der stelle wo sie auf dem bon stehen sollen
                                            //enthält
    static int brieftasche = 50;            //int die inhalt der brieftasche enthält

    static double[] preise = {wurstpreis, kaesepreis, milchpreis, kaffepreis, hundefutterpreis};    //array mit den preisen
    static String[] waren = {wurst, kaese, milch, kaffe,hundefutter};   //array mit den waren

    public static void main(String[] args) {
        noMoney();                          //main methode startet die funktion die den bon ausgeben soll
    }                                       //war ursprünglich für die rückgabe das zu wenig gel da ist geplant
                                            //hat sich dann aber beim programmieren so ergeben dass der ganze bon dadurch ausgegeben wird
    private static void rechnung(){
        for (int i = 0; i < waren.length; i++) {        //rechung() soll den mittelteil des bons erstellen und anzeigen was gekauft wurde
            preise[i] = anzahl[i] * preise [i];         //wie viel und zu welchem Preis dafür liest die forschleife die arrays preise anzahl und
            preise[i] = Math.round(preise[i]*100.0)/100.0; //waren aus und rechnet für den endpreis auf dem bon die anzahl mal die preise und
            System.out.println(waren[i]+ "    " + anzahl[i] + "x    " + preise[i] + "€");//überschreibt den wert für den preis dann im array
        }
    }

    private static void summe(){                        //summe() soll den endpreis ausgeben
        double gsmt = 0;
        double wechselgeld = 0;
        System.out.println("--------------------");
        for(int i = 0; i < preise.length; i++){         //gesammtsumme wird durch auslesen der preise und aufrechnen auf gsmt durch +=
            gsmt += preise[i];                          //zusammengerechnet
        }
        double roundDbl = Math.round(gsmt*100.0)/100.0;             //hier wird der endbetrag auf 2 nachkommastellen gerundet
        System.out.println("Summe:         " + roundDbl + "€");
        System.out.println("Gegeben        " + brieftasche + "€");
        wechselgeld = brieftasche - roundDbl;                       //hier wird das wechselgeld berechnet roundDbl ist der gerundete gesammtbetrag
        System.out.println("Rückgeld:      " + wechselgeld + "€");  //also gegeben - gesammtsumme = wechselgeld
    }
    private static void noMoney(){
        double gsmt = 0;                            //int mit gesammtpreis
        for(int i = 0; i < preise.length; i++){     //forschleife liest preise array aus
            gsmt += preise[i];                      //und addiert die preise zum gesammtpreis
        }
        if(gsmt > brieftasche){                     //wenn zu wenig geld da ist wird ausgegeben du hast nicht genug geld
            System.out.println("Du hast nicht genug Geld!");
        }else{                                      //ansosnten wird der bon gedruckt
            System.out.println("   Einkaufszettel");
            System.out.println("");
            System.out.println("Ware    Menge   Preis");
            System.out.println("--------------------");
            rechnung();                             //nach der kopfzeile wird rechnung und summe aufgerufen
            summe();

        }
    }
}
