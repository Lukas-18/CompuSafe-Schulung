package aufgabe_20_CSVParser__Annotations;

import aufgabe_13_equals.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        CSVParser parser = new CSVParser();

        Person person1 = new Person(20, "Max", "Mustermann", 180, 70);
        Person person2 = new Person(30, "Anna", "Musterfrau", 180, 80);
        Person person3 = new Person(35, "Maximillian", "Mustermann", 173, 66);

        List<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));

        String csv = new CSVParser().parse(persons);

        System.out.println(csv);

    }
}
