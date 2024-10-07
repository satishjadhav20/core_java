package Inheritence.SingleInheritance;

public class Student {
    int rollNo;
    int marks;
    String name;

    void input() {
        System.out.println("enter rollNo,name,marks");
    }

   static class Self extends Student {
        void display() {
            rollNo = 1;
            name = "satish";
            marks = 88;
            System.out.println(rollNo + " " + name + " " + marks);
        }
    }
        public static void main(String[] args) {
            Self s = new Self();
            s.input();
            s.display();
        }
}
