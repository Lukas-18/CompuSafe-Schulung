package aufgabe_22_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<Tier> tiere;
    static Tier elefant;
    static Tier giraffe;
    static Tier loewe;
    static Tier vogel;
    static Tier gepard;

    public static void init(){
        tiere      = new ArrayList<>();
        elefant    = new Tier("Elefant", 11, 730, 4);
        giraffe    = new Tier("Giraffe", 4, 120, 4);
        loewe      = new Tier("Löwe", 10, 310, 4);
        vogel      = new Tier("Vogel", 6, 4, 2);
        gepard     = new Tier("Gepard", 2, 110, 4);

        tiere.add(elefant);
        tiere.add(giraffe);
        tiere.add(loewe);
        tiere.add(vogel);
        tiere.add(gepard);
    }
    public static void main(String[] args){
        init();
        System.out.println(tiere);
        //System.out.println(getTiereMitZweiBeinen(tiere));
        //System.out.println(getTiereUeber10(tiere));
        System.out.println(streamGetTiereMitZweiBeinen(tiere));
        System.out.println(streamGetTiereUeber10(tiere));
        System.out.println(streamGetSchwereUndJungeTiere(tiere, 60, 7));
    }

    public static List<Tier> getTiereMitZweiBeinen(List<Tier> tiere){
        List<Tier> tiereMitZweiBeinen = new ArrayList<>();
        for(int i = 0; i < tiere.size(); i++){
            if(tiere.get(i).getAnzahlBeine() == 2){
                    tiereMitZweiBeinen.add(tiere.get(i));
                }
        }
        System.out.println("\nTiere mit Zwei Beinen: ");
        return tiereMitZweiBeinen;
    }

    public static List<Tier> getTiereUeber10(List<Tier> tiere){
        List<Tier> tiereUeber10 = new ArrayList<>();
        for(Tier t : tiere){
            if(t.getAlter() > 10){
                tiereUeber10.add(t);
            }
        }

        System.out.println("\nTiere über 10: ");
        return tiereUeber10;
    }

    public static List<Tier> streamGetTiereMitZweiBeinen(List<Tier> tiere){
        List<Tier> tiereMitZweiBeinen = tiere.stream().filter(tier -> tier.getAnzahlBeine() == 2).collect(Collectors.toList()); //man kann auch statt "collect..." gleich nach dem Punkt toList(), kommt selbes Ergebnis.
        System.out.println("\nTiere mit Zwei Beinen: ");
        return tiereMitZweiBeinen;
    }

    public static List<Tier> streamGetTiereUeber10(List<Tier> tiere){
        List<Tier> tiereUeber10 = new ArrayList<>();
        tiereUeber10 = tiere.stream().filter(tier -> tier.getAlter() > 10).toList();
        System.out.println("\nTiere über 10: ");
        return tiereUeber10;
    }

    public static List<Tier> streamGetSchwereUndJungeTiere(List<Tier> tiere, double gewicht, int alter){
        //List<Tier> zutreffendeTiere = tiere.stream().filter(tier -> tier.getGewicht() > gewicht && tier.getAlter() < alter).toList();
        List<Tier> zutreffendeTiere = tiere.stream()
                                    .filter(tier -> tier.getGewicht() > gewicht)
                                    .filter(tier -> tier.getAlter() < alter)
                                    .toList();
        System.out.println("\nTiere die schwere sind als " + gewicht + " und jünger sind als " + alter + ": ");
        return zutreffendeTiere;
    }


}
