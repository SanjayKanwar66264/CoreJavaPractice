import java.util.ArrayList;

/**
 * Created by sanjaykanwar on 17/07/2015.
 */
public class SearchAnElementInArrayListExample {

    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("1");
        arrayList.add("2");

        boolean binFound = arrayList.contains("2");
        System.out.println("Does arrayList contain 2 ? " + binFound);
    }
}
