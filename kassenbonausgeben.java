public class kassenbonausgeben {
    static double wurstpreis = 1.2;
    static double kaesepreis = 1.4;
    static double milchpreis = 0.8;
    static double kaffepreis = 2;
    static double hundefutterpreis = 15;
    static String wurst = "Wurst";
    static String kaese = "Käse ";
    static String milch = "Milch";
    static String kaffe = "Kaffe";
    static String hundefutter = "Hundefutter";
    static int[] anzahl ={1,3,5,1,1};

    static int brieftasche = 50;

    static double[] preise = {wurstpreis, kaesepreis, milchpreis, kaffepreis, hundefutterpreis};
    static String[] waren = {wurst, kaese, milch, kaffe,hundefutter};

    public static void main(String[] args) {
        noMoney();
    }

    private static void rechnung(){
        for (int i = 0; i < waren.length; i++) {
            preise[i] = anzahl[i] * preise [i];
            preise[i] = Math.round(preise[i]*100.0)/100.0;
            System.out.println(waren[i]+ "    " + anzahl[i] + "x    " + preise[i] + "€");
        }
    }

    private static void summe(){
        double gsmt = 0;
        double wechselgeld = 0;
        System.out.println("--------------------");
        for(int i = 0; i < preise.length; i++){
            gsmt += preise[i];
        }
        double roundDbl = Math.round(gsmt*100.0)/100.0;
        System.out.println("Summe:         " + roundDbl + "€");
        System.out.println("Gegeben        " + brieftasche + "€");
        wechselgeld = brieftasche - roundDbl;
        System.out.println("Rückgeld:      " + wechselgeld + "€");
    }
    private static void noMoney(){
        double gsmt = 0;
        for(int i = 0; i < preise.length; i++){
            gsmt += preise[i];
        }
        if(gsmt > brieftasche){
            System.out.println("Du hast nicht genug Geld!");
        }else{
            System.out.println("   Einkaufszettel");
            System.out.println("");
            System.out.println("Ware    Menge   Preis");
            System.out.println("--------------------");
            rechnung();
            summe();

        }
    }
}
