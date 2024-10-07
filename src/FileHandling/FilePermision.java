package FileHandling;

import java.io.File;
import java.io.IOException;

public class FilePermision {
    public static void main(String[] args)throws IOException {
        String path = "C:\\Users\\HP\\Desktop\\javaFiles";
        File f = new File(path);
        boolean isFileCreated = f.createNewFile();
        System.out.println("file created"+isFileCreated);
        f.setWritable(false);
        System.out.println("File set to read only");
        System.out.println("File permissions " + f.canWrite());

    }
}
