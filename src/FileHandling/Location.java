package FileHandling;

import java.io.File;

public class Location {
    public static void main(String[] args) {
        String path ="\"C:\\\\Users\\\\HP\\\\Desktop\\\\javaFiles";
        File f = new File(path);
        System.out.println("location is : "+f.getAbsolutePath());
    }
}
