import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by sanjaykanwar on 17/07/2015.
 */
public class CompareIntArraysExample {

    public  static void main(String[] args){

        int[] intArray1 = new int[]{1,2,3,4};
        int[] intArray2 = new int[]{5,6,7,8};


        boolean bool = Arrays.equals(intArray1,intArray2);
        if(bool) {
            System.out.println("TRUE");

        }
        else{
            System.out.println("FALSE");

    }
    }

}
