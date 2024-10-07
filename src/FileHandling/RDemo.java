package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class RDemo {
    public static void main(String[] args) {
       try {
           FileReader r = new FileReader("C:\\Users\\HP\\Desktop\\Java\\LC.txt");
           try {
               int i;
           while ((i = r.read() )!= -1) {
               System.out.print((char)i);
             }
           }
           finally {
               r.close();
               System.out.println("file close");
           }
       }
       catch (IOException e){
           System.out.println("exception handled");
       }
    }
}
