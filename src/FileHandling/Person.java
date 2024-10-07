package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Person {
    public Person(String alice, int i) {

    }

    public static void main(String[] args) throws IOException {
                Person person = new Person("Alice", 30);

                try (FileOutputStream fileOut = new FileOutputStream("person.ext");
                     ObjectOutput out = new ObjectOutputStream(fileOut)) {
                    out.writeObject(person);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



