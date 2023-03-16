package aufgabe_19_Comparator;

import aufgabe_13_equals.Person;

import java.util.Comparator;

public class GewichtComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int person1Gewicht = o1.getGewichtInKg();
        int person2Gewicht = o2.getGewichtInKg();
        if(person1Gewicht < person2Gewicht){
            System.out.println(person1Gewicht + " ist weniger als " + person2Gewicht + " deshalb:");
            return -1;
        } else if(person1Gewicht == person2Gewicht){
            System.out.println(person1Gewicht + " ist gleich wie " + person2Gewicht + " deshalb:");
            return 0;
        } else{
            System.out.println(person1Gewicht + " ist mehr als " + person2Gewicht + " deshalb:");
            return 1;
        }
    }
}
