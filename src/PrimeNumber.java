/**
 * Created by sanjaykanwar on 15/07/2015.
 */
public class PrimeNumber {

    public static void main(String [] args){
        for(int i = 1; i<30; i++){
           boolean isPrime = true;

            //check to see if the number is prime
            for(int j=2; j < i ; j++){

                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i + " ");
        }
    }
}
