package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileWay2 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\HP\\Desktop\\Java\\LC.txt");
        if (f.createNewFile()) {
            System.out.println("file successfully created...!");
        }
        else {
            System.out.println("file already exist...!");
        }
    }
}
