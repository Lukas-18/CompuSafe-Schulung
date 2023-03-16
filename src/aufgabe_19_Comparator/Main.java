package aufgabe_19_Comparator;

import aufgabe_13_equals.Person;

public class Main {

    static Person person1 = new Person(20, "Max", "Musterman", 180, 80);
    static Person person2 = new Person(22, "Anna", "Musterfrau", 180, 80);

    static AlterComparator ac = new AlterComparator();
    static GroesseComparator gc = new GroesseComparator();

    public static void main(String[] args){
        Integer alterPerson1 = person1.getAlter();
        Integer alterPerson2 = person2.getAlter();

        Integer groessePerson1 = person1.getGroesseInCm();
        Integer groessePerson2 = person2.getGroesseInCm();

        System.out.println(person1.getVorname() + " ist " + alterPerson1);
        System.out.println(person2.getVorname() + " ist " + alterPerson2);
        System.out.println(ac.compare(alterPerson1, alterPerson2));
        System.out.println();
        System.out.println(person1.getVorname() + " ist " + groessePerson1 + "cm groß.");
        System.out.println(person1.getVorname() + " ist " + groessePerson2 + "cm groß.");
        System.out.println(gc.compare(groessePerson1, groessePerson2));

    }
}
