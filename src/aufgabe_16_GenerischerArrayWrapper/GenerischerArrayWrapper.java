package aufgabe_16_GenerischerArrayWrapper;


/**
 * P steht für Platzhalter, bei der Objekterstellung wird ein Objekt anstelle des Platzhalters eingefügt,
 * ist quasi wie eine Parameterübergabe innerhalb einer Methode nur auf Klassen-Ebene.
 * @param <P>
 */
public class GenerischerArrayWrapper <P> {

    private P[] arr;
    private int elementCount = 0;

    public GenerischerArrayWrapper(int arrayGroesse){
        arr = (P[]) new Object[arrayGroesse];
    }

    public void add(P newElement){
        // Array is full:
        if(arr[arr.length-1].equals(0)){
            P[] result = (P[]) new Object[arr.length * 2];
            System.arraycopy(arr, 0, result, 0, arr.length);
            arr = result;
        }
        arr[elementCount] = newElement;
        elementCount++;
    }

    public P get(int place){
        return arr[place];
    }

    public int getArraySize(){
        return arr.length;
    }

    public int getElementCount(){
        return elementCount;
    }
}
