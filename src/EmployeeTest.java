/**
 * Created by sanjaykanwar on 15/07/2015.
 */
public class EmployeeTest {

    public static void main(String []args){
        Employee empOne = new Employee("Sanjay Kanwar");
        Employee empTwo  = new Employee("Sunita Kanwar");


        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();

    }
}
