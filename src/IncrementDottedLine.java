/**
 * Created by sanjaykanwar on 21/07/2015.
 */
public class IncrementDottedLine {

    public static void main(String[] args) {
        increaseLine();

    }

    public static void increaseLine() {
        int i,j;
        for(i=0;i<=6;i++) {
            for (j = 1; j <= 7- i; j++)
                System.out.print("*");
             System.out.println("");
        }
    }
}
