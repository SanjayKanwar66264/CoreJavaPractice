/**
 * Created by sanjaykanwar on 16/07/2015.
 */
public class JavaBreakExample {

    public static void main(String [] args)
    {
        int intArray[] = new int[]{1,2,3,4,5};
        System.out.println("Elements less then 3 are:");

        for(int i = 0; i<intArray.length; i++){
            if(intArray[i]==3)
                break;
            else
                System.out.println(i);

    }
    }

}
