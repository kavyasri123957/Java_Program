import java.io.IOException;
//import java.io.InvalidObjectException;
public class exceptionexa {
    static void readFile()
    throws IOException{
        throw new IOException("file error occured");
    }
    public static void main(String[] args)
    {
        readFile();
    }
    catch (IOException e)
    {
        System.out.println("exception in main method "+e.getMessage());
    }
    System.out.println("exception continues after handling exception");
}
