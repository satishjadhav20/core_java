package ObjectClass;
public class DemoToString {
        public static void main(String[] args) {
            class Student{}
            Student student = new Student();

            System.out.println(Integer.toHexString(200));//C8
            System.out.println(student.hashCode());

            System.out.println(Integer.toHexString(student.hashCode()));

            System.out.println(student.getClass().getName() + "@" + Integer.toHexString(student.hashCode()));
            System.out.println(student);
            System.out.println(student.toString());

            DemoToString x = new DemoToString();
            System.out.println(x);
            System.out.println(x.toString());
        }
    }

