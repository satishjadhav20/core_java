package ClassObject;

public class EmpInfo {
   private String name;
   private  int yearOfJoining;
   private  String address;

   public EmpInfo(String name, int yearOfJoining, String address){
      this.name=name;
      this.yearOfJoining=yearOfJoining;
       this.address=address;
   }
   public void display(){
       System.out.println("employee name is "+name);
       System.out.println("employee join year is "+yearOfJoining);
       System.out.println("emloyee address is "+address);
   }
}
 class empDemo{
    public static void main(String[] args) {
        EmpInfo emp1=new EmpInfo("akanksha",2022,"fulewadi");
        EmpInfo emp2=new EmpInfo("satish",2020,"Arale");
        EmpInfo emp3=new EmpInfo("Prajwal",2020,"Arale");

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
