package ObjectClass.Final;

import ObjectClass.StudentDemo;

public class FinalizeMethod {
    public static void main(String[] args) {
        class StudentDemo {
            int id;
            String name;

            @Override
            protected void finalize() throws Throwable {
                System.out.println("finalize method ");
            }
        }

        StudentDemo student = new StudentDemo();
        student = null;

        System.gc();
        System.out.println("rest of main ");
    }
}


