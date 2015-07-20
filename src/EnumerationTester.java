import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by sanjaykanwar on 20/07/2015.
 */
public class EnumerationTester {

    public static void main(String[] args){

        Enumeration days;
        Vector dayNames = new Vector();
        dayNames.add(0, "Monday");
        dayNames.add(1, "Tuesday");
        dayNames.add(2, "Wednesday");
        dayNames.add(3, "Thursday");
        dayNames.add(4, "Friday");
        dayNames.add(5, "Saturday");
        dayNames.add(6, "Sunday");
        days =dayNames.elements();

        while(days.hasMoreElements()){
            System.out.println("Today is " + days.nextElement());
        }
    }
}
