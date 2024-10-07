package FileHandling;

import java.io.File;

public class MaeDirection {
    public static void main(String[] args) {
        String path = "C:\\Users\\HP\\IdeaProjects\\add\\src\\ExceptionHandling";
        File f = new File(path);
        boolean isFolderCreated = f.mkdir();
        System.out.println("folder created: "+isFolderCreated);
    }
}
