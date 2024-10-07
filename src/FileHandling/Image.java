package FileHandling;
import java.awt.image.BufferedImage; //BufferedImage is used to represent images in memory.
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;//provides methods to read and write images.
public class Image {
    public static void main(String[] args) {
                // Specify the path to the image file
                File imageFile = new File("C:\\Users\\HP\\Desktop\\SAVE_20230708_191607.jpg");

                try {
                    // Read the image from the file
                    BufferedImage image = ImageIO.read(imageFile);

                    // Check if the image was successfully read
                    if (image != null) {
                        // Print image properties
                        System.out.println("Image Width: " + image.getWidth());
                        System.out.println("Image Height: " + image.getHeight());
                        System.out.println("Image Type: " + image.getType());
                    } else {
                        System.out.println("The specified file is not an image or could not be read.");
                    }

                } catch (IOException e) {
                    System.out.println("An error occurred while reading the image: " + e.getMessage());
                }
            }
        }



