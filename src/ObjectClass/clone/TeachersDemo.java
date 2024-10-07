package ObjectClass.clone;


import lombok.*;

import java.util.Objects;


public class TeachersDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        @Getter
        @Setter
        class Teacher implements Cloneable{
             int id;
            String name;
            int salary;

           @Override
            public Object clone() throws CloneNotSupportedException{
               return  super.clone();
           }
        }
        Teacher teacher1 = new Teacher(1,"sandeep",90000);
        Teacher teacher2 = teacher1;

        Teacher teacher3 = (Teacher) teacher1.clone();
        System.out.println(teacher1 +"\t"+teacher1.hashCode());
        System.out.println(teacher3+"\t"+teacher3.hashCode());

    }
}
