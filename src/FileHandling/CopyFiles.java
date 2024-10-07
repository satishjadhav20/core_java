package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\HP\\Desktop\\Java\\Akshu.txt");
        FileOutputStream w= new FileOutputStream("C:\\Users\\HP\\Desktop\\Java\\sattu.txt");

        int i;
        while ((i=r.read())!= -1){
            w.write((char)i);
        }
        System.out.println("data copy successfully");
    }
}
