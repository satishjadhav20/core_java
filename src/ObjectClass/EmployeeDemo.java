package ObjectClass;

import java.awt.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        class Employee{
            int eid;
            String ename;
            int salary;

            public Employee(int eid,String ename,int salary) {
                this.eid = eid;
                this.ename=ename;
                this.salary=salary;
            }
        }

        Employee employee1=new Employee(1,"satish",90000);
        Employee employee2=new Employee(1,"satish",90000);
        Employee employee3=new Employee(1,"satish",90000);

        System.out.println("using == opp");

        System.out.println(employee1 == employee2);
        System.out.println(employee2 == employee3);
        System.out.println(employee1 == employee3);

        System.out.println("by using equality method");

        System.out.println(employee1.equals(employee2));
        System.out.println(employee2.equals(employee3));
        System.out.println(employee1.equals(employee3));


    }
}
