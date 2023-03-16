package aufgabe_18_hashCode_und_equals;

import aufgabe_13_equals.Person;

public class HashCodeUndEquals extends Person {

    public HashCodeUndEquals(int alter, String vorname, String nachname, int groesseInCm, int gewichtInKg){
        super(alter, vorname, nachname, groesseInCm, gewichtInKg);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
