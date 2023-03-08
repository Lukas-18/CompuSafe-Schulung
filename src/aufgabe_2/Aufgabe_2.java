package aufgabe_2;

public class Aufgabe_2 {

    public static void main(String[] args){
        int i = 0;
        int j = 7;
        int k = 13;

        // Snippet 1        k = 10
                if (i > 0 || j > 5) {
                    k = 10;
                }

        // Snippet 2        k = 13
                if (i > 0 && j > 5) {
                    k = 10;
                }

        // Snippet 3        k = 10
                if ((i > 0 && j > 5) || k < 15) {
                    k = 10;
                }

        // Snippet 4        k = 13
                if ((i > 0 || j > 5) && k > 15) {
                    k = 10;
                }

        // Snippet 5        k = 13  j = 8
                if (i == 0 & j++ < 5) {
                    k = 10;
                }

        // Snippet 6        k = 13  j = 8
                if (i == 0 && j++ < 5) {
                    k = 10;
                }

        // Snippet 7        k = 13  j = 7
                if (i != 0 && j++ < 5) {
                    k = 10;
                }

        // Snippet 8        k = 13  j = 8
                if (i != 0 & j++ < 5) {
                    k = 10;
                }

    }
}
