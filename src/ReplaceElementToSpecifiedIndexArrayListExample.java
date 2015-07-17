import java.util.ArrayList;

/**
 * Created by sanjaykanwar on 17/07/2015.
 */
public class ReplaceElementToSpecifiedIndexArrayListExample {

    public static void main(String[] args){

        ArrayList arrayList = new ArrayList();
        arrayList.add(0,"Sanjay Kanwar");
        arrayList.add(1, "Sunita Kanwar");
        arrayList.add(2,"Samyog Kanwar");

       for(int index = 0; index< arrayList.size();index++){
           System.out.println("Person at index: " + index + " is " + arrayList.get(index));
       }

        arrayList.set(1, "JOHN JOHN");
        for(int index = 0; index<arrayList.size(); index++){
            System.out.println("person at index: " + index + " is " + arrayList.get(index));
        }

    }
}
