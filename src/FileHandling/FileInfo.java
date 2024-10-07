package FileHandling;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\HP\\Desktop\\Java\\LC.txt");
        if(f.exists()){
            System.out.println("file name: "+f.getName());
            System.out.println("file location: "+f.getAbsoluteFile());
            System.out.println("file writable: "+f.canWrite());
            System.out.println("file readable: "+f.canRead());
            System.out.println("file size: "+f.length());
        }
        else {
            System.out.println("file does not exist...");
        }
    }
}
