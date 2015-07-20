import java.util.Scanner;

/**
 * Created by sanjaykanwar on 20/07/2015.
 */
public class Add {

    public static void main(String[] args){

        printNumbers();
    }

    static  void printNumbers(){
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num1:");
        a = scanner.nextFloat();
        System.out.println("Enter Num2:");
        b = scanner.nextFloat();
        System.out.println("Before addition value of first variable is" + a);
        a = a+b;
        System.out.println("After addition value of first variable is" + a);


    }


}
