import java.util.Scanner;

/**
 * Created by sanjaykanwar on 20/07/2015.
 */
public class SimpleIfElse {

    public static void main(String[] args){
        votingCriteria();
    }

    static void votingCriteria(){
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please ENter your age: ");
        age = scanner.nextInt();
        if(age < 18){
            System.out.println("Sorry You are not eligible to vote");
        }
        else{
            System.out.println("Congralutions, You are eligible to vote");
        }

    }

}
