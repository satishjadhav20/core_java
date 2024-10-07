package ObjectClass;

import java.util.Objects;

public class StudentDemo {
    public static void main(String[] args) {
        class StudentC{
            int id;
            String name;

            public StudentC(int id,String name) {
                this.id = id;
                this.name=name;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                StudentC studentC = (StudentC) o;
                return id == studentC.id && Objects.equals(name, studentC.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(id, name);
            }
        }

        StudentC studentC1 = new StudentC(1,"Akanksha");
        StudentC studentC2 = new StudentC(1,"Akanksha");

        System.out.println("using equals()");

        System.out.println(studentC1.equals(studentC2));
        System.out.println(studentC1.equals(null));

        System.out.println("by using hash code");

        System.out.println("hash code is "+studentC1.hashCode());
        System.out.println("hash code is "+studentC2.hashCode());
    }
}
