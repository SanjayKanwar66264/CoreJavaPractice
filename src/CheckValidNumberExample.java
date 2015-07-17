/**
 * Created by sanjaykanwar on 15/07/2015.
 */
public class CheckValidNumberExample {

    public  static void main(String [] args) {
        String[] str = new String[]{"10.20", "123456", "12.invalid"};
        for (int i = 0; i < str.length; i++) {
            if (str[i].indexOf(".") > 0) {
                try {
                    Double.parseDouble(str[i]);
                    System.out.println(str[i] + "is a valid decimal Number");
                } catch (NumberFormatException ex) {
                    System.out.println(str[i] + " is not a valid decimal number");
                }

            } else {
                try {
                    Integer.parseInt(str[i]);
                    System.out.println(str[i] + " Is a valid integer");
                } catch (NumberFormatException ex) {
                    System.out.println(str[i] + " is not a valid integer");
                }

            }
        }
    }
}
