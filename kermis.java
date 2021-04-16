import java.util.Scanner;
public class kermis {
    public static void main(String[] args) {
        String inp;
        Scanner scanner = new Scanner(System.in);
        while (!(inp = scanner.nextLine()).equals("stop")) {
            if (inp.equals("1")){
                Botsauto.draaien();
            }
            if (inp.equals("2")){
                if (Spin.gekeurd == 0){
                    Spin.opstellingsKeuring();
                    Spin.gekeurd = 1;
                }
                try{
                    Spin.draaien();
                }catch (Exception e){
                    System.out.println("Voor monteur, druk 'm' in:");
                    if ((inp = scanner.nextLine()).equals("m")){
                        System.out.println("Monteur heeft " + Spin.naam + " gerepareerd.");
                        Spin.keerGedraaid = 0;
                    }
                }
            }
            else if (inp.equals("o")){
                System.out.println("De totale omzet is " + Kassa.omzet + " Euro.");
                System.out.println("Omzet per attractie: " 
                + Botsauto.naam + ": " + Botsauto.omzet + " Euro, "
                + Spin.naam + ": " + Spin.omzet + " Euro, "
                //+ Botsauto.naam + ": " + Botsauto.omzet + " Euro, "
                //+ Botsauto.naam + ": " + Botsauto.omzet + " Euro, "
                //+ Hawai.naam + ": " + Hawai.omzet + " Euro, "
                //+ Botsauto.naam + ": " + Botsauto.omzet + " Euro."
                );
            }
            else if (inp.equals("k")){
                System.out.println("Er zijn " + Kassa.kaartjes + " kaartjes verkocht");
                System.out.println("Kaartjes per attractie: " 
                + Botsauto.naam + ": " + Botsauto.kaartjes + ", "
                + Spin.naam + ": " + Spin.kaartjes + ", "
                //+ Botsauto.naam + ": " + Botsauto.kaartjes + ", "
                //+ Botsauto.naam + ": " + Botsauto.kaartjes + ", "
                //+ Hawai.naam + ": " + Hawai.kaartjes + ", "
                //+ Botsauto.naam + ": " + Botsauto.kaartjes + "."
                );
            }
        }
        System.out.println("Kermis afgesloten.");
        System.exit(1);
        scanner.close();
    }
}

class Kassa{
    static double omzet = 0;
    static int kaartjes = 0;
}

class Attractie{
    String naam;
    double prijs;
    int oppervlakte;
    double omzet;
    int kaartjes;
}

abstract class RisicoRijkeAttractie extends Attractie{
    int draaiLimiet = 0;
    static void opstellingsKeuring(){}
}

class Botsauto extends Attractie{
    final static String naam = "Botsauto";
    final static double prijs = 2.5;
    final static int oppervlakte = 100;
    static double omzet = 0;
    static int kaartjes = 0;
    static void draaien(){
        omzet += prijs;
        Kassa.omzet += prijs;
        kaartjes++;
        Kassa.kaartjes++;
        System.out.println(naam + " draait.");
    }
}

class Spin extends RisicoRijkeAttractie{
    final static String naam = "Spin";
    final static double prijs = 2.25;
    final static int oppervlakte = 200;
    static double omzet = 0;
    static int kaartjes = 0;
    static int draaiLimiet = 5;
    static int keerGedraaid = 0;
    static int gekeurd = 0;
    static void draaien() throws Exception{
        if (Spin.keerGedraaid < Spin.draaiLimiet) {
            omzet += prijs;
            Kassa.omzet += prijs;
            kaartjes++;
            Kassa.kaartjes++;
            keerGedraaid++;
            System.out.println(naam + " draait.");
        } else {
            throw new Exception();
        }
    }
    static void opstellingsKeuring(){
        System.out.println(naam + " wordt gekeurd.");
    }
}