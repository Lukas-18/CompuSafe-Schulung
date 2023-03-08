package tests;

public class BreakInSchleife {

    public static void main (String[] args){
        //breakInSchleife();
        continueInSchleife();
    }

    public static void breakInSchleife(){
        for(int i = 0; i < 10; i++){
            if(i == 3){
                break;
            } else {
                System.out.println(i);
            }
        }
    }

    public static void continueInSchleife(){
        for(int i = 0; i < 10; i++){
            if(i == 3){
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
