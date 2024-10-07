package FileHandling;

import java.io.*;

public class FileWritingExample {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\HP\\Desktop\\Java\\LC.txt");
        try(FileWriter writer = new FileWriter(f)) {
            writer.write("Hello, this is a test message.\n");
            writer.write("This data is written to the file.");
            System.out.println("Successfully wrote data to file.");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
