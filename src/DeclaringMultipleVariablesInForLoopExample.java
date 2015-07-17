/**
 * Created by sanjaykanwar on 15/07/2015.
 */
public class DeclaringMultipleVariablesInForLoopExample {

    public static void main(String[] args){
        for(int i = 0, j=1, k=2;i<5; i++){
            System.out.println("I : " + i + ",j : "+ j + ", k : " + k);
        }
    }
}
