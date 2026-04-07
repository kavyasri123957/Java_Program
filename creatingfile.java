import java.io.File;
import java.io.IOException;
public class creatingfile {
    public static void main(String[] args)
    {
        try{
            File myfile=new File("Filename.txt");
            if(myfile.createNewFile())
            {
                System.out.println("file created :"+myfile.getName());
            }
            else{
                System.out.println("the file already exists:");
            }
        }
            catch(Exception e)
            {
                System.out.println("an error occured:");
                e.printStackTrace();
            }
            
        }
    }
    

