package FileHandling;

import java.io.File;
import java.io.FilenameFilter;

public class ListingOperations {
    public static void main(String[] args) {
        String path = "C:\\Users\\HP\\IdeaProjects\\add\\src\\ExceptionHandling";
        File f = new File(path);
        FilenameFilter fileNameFilter1 = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.length() > 10;
            }
        };

        FilenameFilter fileNameFilter2 = (dir, name) -> name.length() > 15;
        FilenameFilter fileNameFilter3 = (dir, name) -> name.startsWith("D");
        FilenameFilter fileNameFilter = (dir, name) -> name.contains("Demo1");
        String[] fileNamesFromGivenFolder = f.list(fileNameFilter3);

        for (String temp : fileNamesFromGivenFolder) {
            System.out.println(temp);
        }
    }
}
