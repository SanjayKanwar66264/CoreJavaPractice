import java.util.ArrayList;

/**
 * Created by sanjaykanwar on 17/07/2015.
 */
public class RemoveElementFromArrayListExample {

    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        for(int index = 0; index<arrayList.size(); index++){
            System.out.println("Number at index " + index + " is " + arrayList.get(index));

        }
        arrayList.remove(0);

        for(int index = 0; index<arrayList.size(); index++){
            System.out.println("Number at index " + index + " is " + arrayList.get(index));

        }
    }
}
