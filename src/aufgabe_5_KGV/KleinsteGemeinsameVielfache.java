package aufgabe_5_KGV;

import java.util.Scanner;

public class KleinsteGemeinsameVielfache {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // sout + Tab
        System.out.println("Zahl 1: ");
        int zahl1 = scan.nextInt();
        System.out.println("Zahl 2: ");
        int zahl2 = scan.nextInt();

        System.out.println("KGV: " + kgv(zahl1, zahl2));
    }

    static int kgv(int zahl1, int zahl2){

        int temp_1 = zahl1;
        int temp_2 = zahl2;

        while(temp_1 != temp_2){
            if (temp_1 < temp_2 ){
                temp_1 += zahl1;
            } else {
                temp_2 += zahl2;
            }
        }
        return temp_1;
    }
}
