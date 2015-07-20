import java.io.File;
import java.io.IOException;

/**
 * Created by sanjaykanwar on 17/07/2015.
 */
public class CreateTempFile {
    public static void main(String[] args){
        File file1 = null;
        File file2 = null;

        try {

            file1= File.createTempFile("/Users/sanjaykanwar/WebstormProjects/PraticeCode/src/TEST",".csv");
            file2= File.createTempFile("/Users/sanjaykanwar/WebstormProjects/PraticeCode/src/TEST2",".xlsx");

        }
        catch (IOException ioe){
            System.out.println("Exception creating temporary file : " + ioe);
        }
        System.out.println("Temporary file with CSV suffix extension: "
                + file1.getPath());
        System.out.println("Temporary file with XLSX suffix extension: "
                + file2.getPath());
    }

}
