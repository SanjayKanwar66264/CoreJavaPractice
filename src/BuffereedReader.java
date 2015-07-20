import java.io.*;

/**
 * Created by sanjaykanwar on 20/07/2015.
 */
public class BuffereedReader {

    public  static void main(String[] args){

        name();
    }
    static  void name(){
        String pname = null;

        try
            {

                BufferedReader bufferedOutputStream = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter your name:");
                pname = bufferedOutputStream.readLine();
            }
            catch(IOException ex){
                System.out.println("Hello "+pname);
            }


    }
}
