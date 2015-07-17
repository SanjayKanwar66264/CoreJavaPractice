import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by sanjaykanwar on 17/07/2015.
 */
public class SortVectorInDescendingOrderExample {

    public static void main(String[] args){

        ArrayList arrayList = new ArrayList();

        arrayList.add('e');
        arrayList.add('c');
        arrayList.add('b');
        arrayList.add('d');
        arrayList.add('a');


        Comparator comparator = Collections.reverseOrder();
        System.out.println("Before sorting Vector in descending order : " + arrayList);

        Collections.sort(arrayList,comparator);
        System.out.println("After sorting Vector in descending order : " + arrayList);

    }
}
