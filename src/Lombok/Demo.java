package Lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Demo {
    int id;
    String name;
    int rollNo;

}
class TestDemo{
    public static void main(String[] args) {
        Demo d2 = new Demo();
        Demo d = new Demo(1,"satish",11);

        System.out.println(d.id);
        System.out.println(d.name);
        System.out.println(d.rollNo);
        System.out.println(d2);
        System.out.println(d);
    }
}
