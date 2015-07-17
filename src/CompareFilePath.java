import java.io.File;

/**
 * Created by sanjaykanwar on 16/07/2015.
 */
public class CompareFilePath {

    public static void main(String args[]){
        File file = new File("/Users/sanjaykanwar/WebstormProjects/PraticeCode/src/test.txt");
        File file1 = new File("/Users/sanjaykanwar/WebstormProjects/PraticeCode/src/test.txt");

        if(file.compareTo(file1)==0){
            System.out.println("Same File Path");
        }
        else{
            System.out.println("Different File Path");
        }
    }
}
