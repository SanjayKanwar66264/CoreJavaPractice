import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sanjaykanwar on 17/07/2015.
 */
public class CompareBooleanArraysExample {

    public static void main(String[] args){

        boolean[] boolArray1 = new boolean[]{true,false,true,false};
        boolean[] boolArray3 = new boolean[]{true,false,true,false};


        boolean compare = Arrays.equals(boolArray3,boolArray1);

        if(compare){
            System.out.println("Two are Equal.");
        }
        else {
            System.out.println("Two are not Equal");
        }
    }
}
