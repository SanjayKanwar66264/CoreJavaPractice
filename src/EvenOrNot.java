import java.util.Scanner;

/**
 * Created by sanjaykanwar on 20/07/2015.
 */
public class EvenOrNot {

    public static void main(String[] args){
        isEven();

    }

    static  void isEven(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        number = scanner.nextInt();
        if(number%2==0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }

    }
}
