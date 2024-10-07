package FileHandling;

import java.io.*;

public class CreateFiles {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\HP\\Desktop\\Java\\LC.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("file successfully created...!");
            } else {
                System.out.println("file already exist...!");
            }
        }
        catch(IOException i){
            System.out.println("exception handled..!");
        }
    }
}
