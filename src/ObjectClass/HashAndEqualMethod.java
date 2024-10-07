package ObjectClass;

import java.util.Objects;

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Student student))
            return false;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class HashAndEqualMethod {
    public static void main(String[] args) {
        Student student1 = new Student(1,"ashish");
        Student student2 = new Student(1,"ashish");

        System.out.println(student1.equals(student2));
    }
}
