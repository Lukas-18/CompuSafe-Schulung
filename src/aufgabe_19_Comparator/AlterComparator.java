package aufgabe_19_Comparator;

import aufgabe_13_equals.Person;

import java.util.Comparator;

public class AlterComparator implements Comparator<Integer> {

    AlterComparator(){
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2){
            System.out.println(o1 + " ist kleiner als " + o2 + " deshalb:");
            return -1;
        } else if(o1 == o2){
            System.out.println(o1 + " ist gleich wie " + o2 + " deshalb:");
            return 0;
        } else{
            System.out.println(o1 + " ist größer als " + o2 + " deshalb:");
            return 1;
        }
    }
}

