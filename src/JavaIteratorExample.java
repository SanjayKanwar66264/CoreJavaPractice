import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by sanjaykanwar on 17/07/2015.
 */
public class JavaIteratorExample {

    public static void main(String[] args){

        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
