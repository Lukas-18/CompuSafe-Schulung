package tests.konstruktoraufrufBeiObjekterstellung;

public class Superklasse extends SuperSuperklasse{

    public int zahl = 5;
    Superklasse(){
        System.out.println(this);
    }

    public void rufeAuf(){
        System.out.println("Oberklasse!");
    }
}
