package ClassObject;

public class Student {
    int rollNo;
    String name;

    public Student(){

    }

    public void setInfo(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    public  void display(){
        System.out.println("student roll number is :"+rollNo);
        System.out.println("student name is :"+name);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo=1;
        s1.name="satish";
        s1.display();

        Student s2=new Student();
        s2.rollNo=2;
        s2.name="Akanksha";
        s2.display();
    }
}
