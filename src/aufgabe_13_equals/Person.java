package aufgabe_13_equals;

import aufgabe_20_CSVParser__Annotations.CSVEntity;
import aufgabe_20_CSVParser__Annotations.CSVField;

import java.util.Objects;

@CSVEntity
public class Person implements Comparable<Person>{
    private int alter;
    @CSVField
    public String vorname;
    @CSVField
    public String nachname;
    @CSVField
    public int groesseInCm;
    private int gewichtInKg;

    public Person(int alter, String vorname, String nachname, int groesseInCm, int gewichtInKg){
        this.alter = alter;
        this.vorname = vorname;
        this.nachname = nachname;
        this.groesseInCm = groesseInCm;
        this.gewichtInKg = gewichtInKg;
    }

    public Person(){
    }

    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getGroesseInCm() {
        return groesseInCm;
    }
    public void setGroesseInCm(int groesseInCm) {
        this.groesseInCm = groesseInCm;
    }

    public int getGewichtInKg() {
        return gewichtInKg;
    }
    public void setGewichtInKg(int gewichtInKg) {
        this.gewichtInKg = gewichtInKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return alter == person.alter && groesseInCm == person.groesseInCm && gewichtInKg == person.gewichtInKg && vorname.equals(person.vorname) && nachname.equals(person.nachname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "alter=" + alter +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", groesseInCm=" + groesseInCm +
                ", gewichtInKg=" + gewichtInKg +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(alter, vorname, nachname, groesseInCm, gewichtInKg);
    }

    @Override
    public int compareTo(Person o) {
        return this.getVorname().compareTo(o.getVorname());
    }
}
