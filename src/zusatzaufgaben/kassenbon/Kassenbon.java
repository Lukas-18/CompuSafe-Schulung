package zusatzaufgaben.kassenbon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kassenbon {

    static Scanner scan = new Scanner(System.in);
    static Ware wurst = new Ware("Wurst", 4.20);
    static Ware kaese = new Ware("Käse", 2.30);
    static Ware brot = new Ware("Brot", 2.10);
    static Ware DVD = new Ware("DVD", 12.00);
    static Ware [] warenGruppe;
    static ArrayList<Ware> gewaehlteWaren = new ArrayList<>();
    static double toPay;

    public static void main(String[] args){
        output();
    }

    public static void initialize(){
        warenGruppe = new Ware[]{wurst, kaese, brot, DVD};
    }

    public static void output(){
        System.out.println("1) Buy  2) Pay  3) Cancel");
        switch(scan.nextInt()){
            case 1:
                showProducts();
                break;
            case 2:
                addUp();
                break;
            case 3:
                sayBye();
                break;
            default:
                sayBye();
        }
    }
    public static void showProducts(){
        initialize();
        for (int i = 0; i < warenGruppe.length; i++) {
            System.out.println(warenGruppe[i].name + "    \t" + warenGruppe[i].price);
        }
        System.out.println();
        chooseProducts();
    }

    public static void chooseProducts(){
        System.out.println(
                " 1) " + warenGruppe[0].name + "\n" +
                " 2) " + warenGruppe[1].name + "\n" +
                " 3) " + warenGruppe[2].name + "\n" +
                " 4) " + warenGruppe[3].name
        );
        switch(scan.nextInt()){
            case 1:
                gewaehlteWaren.add(warenGruppe[0]);
                break;
            case 2:
                gewaehlteWaren.add(warenGruppe[1]);
                break;
            case 3:
                gewaehlteWaren.add(warenGruppe[2]);
                break;
            case 4:
                gewaehlteWaren.add(warenGruppe[3]);
                break;
            default:
                sayBye();
        }
        output();
    }

    public static void addUp(){
        for(int i = 0; i < gewaehlteWaren.size(); i++){
            toPay += gewaehlteWaren.get(i).price;
        }
        System.out.println("You have to pay: " + toPay);
        double givenMoney = giveMoney();
        if(givenMoney < toPay){
            System.out.println("Give enough money!");
            giveMoney();
        } else {
            double aufZweiNachkommaStellen = (givenMoney - toPay) * 100;
            aufZweiNachkommaStellen = Math.round(aufZweiNachkommaStellen);
            aufZweiNachkommaStellen = aufZweiNachkommaStellen / 100;
            System.out.println("You get back: " + aufZweiNachkommaStellen);
        }
    }

    public static double giveMoney(){
        System.out.println("You give money: ");
        return scan.nextDouble();
    }

    public static void sayBye(){
        System.out.println("Bye!");
    }
}
