package aufgabe_15_CopyObjects;

import aufgabe_13_equals.Person;

import java.util.List;

public class Main {

    public static void main(String[] agrs){
        CopyObjects copy3 = new CopyObjects(new Person(30, "Hans", "Glück", 175, 70), 3);

        List<Person> listOfCopies = copy3.getList();
        System.out.println(listOfCopies.toString().replaceAll("},", "},\n"));
        System.out.println(copy3.howManyElements());
    }
}
