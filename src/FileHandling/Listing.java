package FileHandling;

import java.io.File;

public class Listing {
    public static void main(String[] args) {
        String path = "C:\\Users\\HP\\IdeaProjects\\add\\src\\encapsulation";
        File f = new File(path);
        String[] fileNamesFromGivenFolder = f.list();
        for (String temp : fileNamesFromGivenFolder) {
            System.out.println(temp);
     }
    }
}
