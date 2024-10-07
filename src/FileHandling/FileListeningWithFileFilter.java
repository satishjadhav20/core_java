package FileHandling;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileListeningWithFileFilter {
    public static void main(String[] args)throws IOException {

                String path = "C:\\Work\\ISJ010\\core-java\\src\\exceptionHandling";
                File folder = new File(path);

                FileFilter fileFilter1 = new FileFilter() {
                    @Override
                    public boolean accept(File file) {
                        return file.length() > 800;
                    }
                };

                FileFilter fileFilter2 = file -> file.length() > 1000;

                File[] files = folder.listFiles(fileFilter2);


                for (File file : files) {
                    System.out.println(file.getName() + "\t" + file.length());
                }


            }
        }


