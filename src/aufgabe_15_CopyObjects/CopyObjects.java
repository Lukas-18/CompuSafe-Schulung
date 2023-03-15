package aufgabe_15_CopyObjects;

import aufgabe_13_equals.Person;

import java.util.ArrayList;
import java.util.List;

public class CopyObjects {


    private List<Person> copysOfPerson = new ArrayList<>();
    public CopyObjects(Person personToCopy, int howManyCopies) {
        for (int i = 0; i < howManyCopies; i++) {
            copysOfPerson.add(personToCopy);
        }
    }

    public List<Person> getList(){
        return copysOfPerson;
    }

    public int howManyElements(){
        return copysOfPerson.size();
    }

}
