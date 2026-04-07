import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try {
            File file = new File("filename.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter("filename.txt");
            writer.write("Hello Kavya!\n");
            writer.write("how are you: \n");
            writer.write("Java File Handling.");
            writer.close();
            System.out.println("Successfully written data.");
        } catch (IOException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}