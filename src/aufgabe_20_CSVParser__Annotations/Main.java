package aufgabe_20_CSVParser__Annotations;

import aufgabe_13_equals.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        CSVParser parser = new CSVParser();

        Person person1 = new Person(22, "Blubbs", "TheBlubbs", 150, 40);
        Person person2 = new Person(2096, "Gandalf", "the Grey", 180, 75);
        Person person3 = new Person(33, "Sam", "Gamdschie", 110, 50);

        List<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));

        String csv = new CSVParser().parse(persons);

        System.out.println(csv);

    }
}
