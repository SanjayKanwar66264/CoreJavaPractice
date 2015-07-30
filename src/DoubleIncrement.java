/**
 * Created by sanjaykanwar on 21/07/2015.
 */
public class DoubleIncrement {

    public static void main(String[] args){

        /*for(int i=0;i<6;i++){

            for(int j=1; j<7-1;j++)
                System.out.println("*");
            for(int k =1; k>6;i++)
                System.out.println(i);
        }*/

        int i,j,k;

        for (i = 1; i <= 7; i++)
        {
            for (k = 7 - i; k >= 1; k--)
                System.out.print("*");

            for (j = 1; j <= i; ++j)
                System.out.print(j);



            System.out.println("");
        }

    }


}
