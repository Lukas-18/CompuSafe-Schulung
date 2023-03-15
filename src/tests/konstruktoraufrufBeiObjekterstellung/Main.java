package tests.konstruktoraufrufBeiObjekterstellung;

public class Main {
    public static void main (String[] args){
        /**
         * das this in den jeweiligen Konstruktoren verweißt auf den Speicherplatz des Objektes.
         * Da jeweils genau der selbe Speicherplatz ausgegeben wird, wird klar, dass es sich beim Subobjekt um das
         * selbe Objekt handelt wie bei den jeweiligen Superklassen.
         * Dieses Objekt wird jedoch immer gecastet in das nächst-untere Objekt.
         *
         * D.h.:
         * 'Object' wird gecastet in 'SuperSuperklasse'
         * 'SuperSuperklasse' wird gecastet in 'Superklasse'
         * 'Superklasse' wird gecastet in 'Subklasse'
         *
         * Somit werden zwar 4 Objekte erstellt, aber nicht 4 Verschiedene, sondern das eine wird immer
         * weiterrunter gecastet.
         */
        new Subklasse();
    }
}
