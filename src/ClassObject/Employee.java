package ClassObject;

public class Employee {
    int id;
    String name;
    String designation;

    public  Employee(int id, String name, String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;
    }
    public void display(){
        System.out.println("employee id is :"+id);
        System.out.println("employee name is :"+name);
        System.out.println("department of employee is :"+designation);
    }
    public static void main(String[] args) {
    Employee e = new Employee(1,"satish","programmer");
    e.display();
    }
}
