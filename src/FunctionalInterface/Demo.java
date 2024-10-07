package FunctionalInterface;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
public class Demo {
    public static void main(String[] args) {
        @FunctionalInterface
        interface InputStreamOpener {
            InputStream open(String str);
        }
        class DataInputStream implements InputStreamOpener {
            @Override
            public InputStream open(String str) {
                return new ByteArrayInputStream(str.getBytes());
            }
        }
        class ObjectInputStream implements InputStreamOpener {
            @Override
            public InputStream open(String str) {
                return new ByteArrayInputStream(str.getBytes());
            }
        }
        class BufferedInputStream implements InputStreamOpener {
            @Override
            public InputStream open(String str) {
                return new ByteArrayInputStream(str.getBytes());
            }
        }
    }
}

