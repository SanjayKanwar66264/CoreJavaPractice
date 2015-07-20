import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by sanjaykanwar on 20/07/2015.
 */
public class Arthametic {
    public static void main(String[] args){

        printSolution();
    }

    static void printSolution(){
        int num1 = 2;
        int num2 = 4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num1:");
        num1 = scanner.nextInt();
        System.out.print("Enter Num2:");
        num2=scanner.nextInt();

        int result = num1+num2;
        System.out.println(result);

    }

}
