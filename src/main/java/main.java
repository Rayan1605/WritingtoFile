import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
     File myfile = new File("MyFile2.txt");
        System.out.println("My file is located at " + myfile.getAbsolutePath());
        String content = "Details to write";
        try{
            FileWriter myWriter = new FileWriter(myfile);
 //To append, just add true
   FileWriter SecondWriter = new FileWriter(myfile, true);
            myWriter.write("ggg");
            myWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
