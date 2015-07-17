/**
 * Created by sanjaykanwar on 15/07/2015.
 */
public class CalculateArrayAverageExample {

    public  static void main(String []args){
        int[] numbers = new int[]{1,2,3,4,5,6,7};


        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
            System.out.println("Total number of elements " + numbers.length);
            double average  = sum/numbers.length;
            System.out.println("Average value of array elements is : " + average);
        }
    }
}
