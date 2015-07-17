import java.io.*;

/**
 * Created by sanjaykanwar on 16/07/2015.
 */
public class ReadFileUsingBufferedInputStream {


    public static void main(String []args){
        File file = new File("/Users/sanjaykanwar/WebstormProjects/PraticeCode/src/test.txt");
        BufferedInputStream bin = null;

        try{
            FileInputStream fin = new FileInputStream(file);
                    bin = new BufferedInputStream(fin);

            while( bin.available() > 0 ){

                System.out.print((char)bin.read());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found" + e);
        }
        catch (IOException ioe){
            System.out.println("Exception while reading the file " + ioe);

        }

        finally {
            try{
                if(bin != null)
                    bin.close();

            }catch(IOException ioe)
            {
                System.out.println("Error while closing the stream : " + ioe);
            }
        }

    }
}
