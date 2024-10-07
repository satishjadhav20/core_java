package ObjectClass;

public class ContentAndRef {
    public static void main(String[] args) {
        class student {
            int id;
            String name;

            public student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }

            student student1 = new student(1, "Akanksha");
            student student2 = new student(1, "Akanksha");
            student student3 = student1;


        System.out.println("by using reference");

        System.out.println(student1 == student2);
        System.out.println(student2 == student3);
        System.out.println(student1 == student3);

        System.out.println("by using content ");

            int a = 10;
            int b = 10;
            int c = 30;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        }
    }

