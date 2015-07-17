/**
 * Created by sanjaykanwar on 16/07/2015.
 */
public class ReverseNumber {

    public static void main(String[] args){

        int number = 1234;
        int temp= 0;
        int reverseNumber = 0;

        while(number>0){
            temp =number%10;

            reverseNumber = reverseNumber*10+temp;
            number = number/10;

        }
        System.out.println("Reversed Number is: " + reverseNumber);
    }
}
