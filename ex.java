import java.io.*;
public class ex {
    public static void main(String[] args)
    {
        try{
            BufferedReader br=new BufferedReader(new FileReader("filenae.txt"));
            String line;
            int wordcount=0;
            while((line=br.readLine())!=null)
            {
                String words[]=line.split( " ");
                wordcount+=words.length;
            }
            br.close();
            System.out.println("Total words:"+wordcount);
            

        }catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
