package Inheritence;

import lombok.*;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class Employee{
   String name;
   String id;
  
}
class WageEmployee extends Employee{

    public WageEmployee(String name, String id, int hrs, int rate) {
    }
}
public class TestEmp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter employee name ");
        String name = sc.nextLine();
        System.out.println("Enter employee id");
        String id = sc.nextLine();

        System.out.println("Number of hrs worked : ");
        int hrs = sc.nextInt();

        System.out.println("Enter hourly rate : ");
        int rate = sc.nextInt();
        
        WageEmployee wageEmployee = new WageEmployee(name,id,hrs,rate);
    }
}
