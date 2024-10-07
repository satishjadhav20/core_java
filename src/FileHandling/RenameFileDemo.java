package FileHandling;

import java.io.*;
import java.io.IOException;

public class RenameFileDemo {
    public static void main(String[] args)  {
        File f = new File("C:\\Users\\HP\\Desktop\\Java\\LC.txt");
        File r = new File("C:\\Users\\HP\\Desktop\\Java\\Satish.txt");

        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("file does not exist");
        }
    }
}
