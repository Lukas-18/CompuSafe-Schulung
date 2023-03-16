package aufgabe_19_Comparator;

import aufgabe_13_equals.Person;

import java.util.Comparator;

public class VornameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String person1Vorname = o1.getVorname();
        String person2Vorname = o2.getVorname();
        if(person1Vorname.equals(person2Vorname)){
            System.out.println(person1Vorname + " ist kleiner als " + person2Vorname + " deshalb:");
            return -1;
        } else if(person1Vorname.equals(person2Vorname)){
            System.out.println(person1Vorname + " ist gleich wie " + person2Vorname + " deshalb:");
            return 0;
        } else{
            System.out.println(person1Vorname + " ist größer als " + person2Vorname + " deshalb:");
            return 1;
        }
    }
}
