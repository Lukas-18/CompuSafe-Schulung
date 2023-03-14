package aufgabe_14_ArrayWrapper;

public class ArrayWrapper {

    private int[] arr;
    private int elementCount = 0;

    public ArrayWrapper(int arrayGroesse){
        arr = new int[arrayGroesse];
    }

    public void add(int newElement){
        // Array is full:
        if(arr[arr.length-1] != 0){
            int[] result = new int[arr.length * 2];
            System.arraycopy(arr, 0, result, 0, arr.length);
            arr = result;
        }
        arr[elementCount] = newElement;
        elementCount++;
    }

    public int get(int place){
        return arr[place];
    }

    public int getArraySize(){
        return arr.length;
    }

    public int getElementCount(){
        return elementCount;
    }
}
