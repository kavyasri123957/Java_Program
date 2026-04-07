import java.io.File;
import java.io.IOException;
public class file_ex{
    public static void main(String[] args)
    {
       try{

File myfile=new File("filename.txt");
       if( myfile.createNewFile()) 
       { 
        System.out.println("my file name :"+myfile.getName());

       }else{
        System.out.println("file already exists:");
       }
    }
    catch(IOException e)
    {
        System.out.println("an error occured:");
   e.printStackTrace();//to print the error line by line and ehich line error has occured 
    }
}

}