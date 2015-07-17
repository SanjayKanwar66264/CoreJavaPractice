import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by sanjaykanwar on 17/07/2015.
 */
public class CompareCharArraysExample {

    public static void main(String[] args){
        char[] charArray1 = new char[]{'a','b','c'};
        char[] charArray2 = new char[]{'b','b','c'};

        boolean bool = Arrays.equals(charArray1,charArray2);

        if(bool)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

    }
}
