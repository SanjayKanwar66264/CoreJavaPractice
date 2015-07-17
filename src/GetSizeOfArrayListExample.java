import java.util.ArrayList;

/**
 * Created by sanjaykanwar on 17/07/2015.
 */
public class GetSizeOfArrayListExample {

    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        int totalElements = arrayList.size();
        for(int i = 0; i<arrayList.size();i++){
            System.out.println("Printing element: " +  arrayList.get(i));
        }

    }
}
