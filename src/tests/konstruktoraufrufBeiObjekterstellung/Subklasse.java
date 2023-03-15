package tests.konstruktoraufrufBeiObjekterstellung;

public class Subklasse extends Superklasse{
    Subklasse(){
        System.out.println(this);
    }

    public void rufeAufUnten(){
        rufeAuf();
    }
}
