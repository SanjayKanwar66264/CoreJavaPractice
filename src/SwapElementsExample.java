/**
 * Created by sanjaykanwar on 16/07/2015.
 */
public class SwapElementsExample {

    public static void main(String[] args){

        int num1 = 10;
        int num2 = 20;

        System.out.println("Before Swapping:");
        System.out.println("Num1 value is :" + num1);
        System.out.println("Num2 value is :" + num2);

        swap(num1,num2);
    }

    private static void swap(int num1,int num2){
        int temp = num1;
        num1 =num2;
        num2 = temp;

        System.out.println("After Swapping:");
        System.out.println("Num1 value is :" + num1);
        System.out.println("Num2 value is :" + num2);


    }
}
