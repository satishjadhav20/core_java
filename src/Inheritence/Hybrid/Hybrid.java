package Inheritence.Hybrid;

interface ITServices{
    public void getITServices();
}

interface HardwareServices{
    public void getHardwareServices();
}

class BaseCompany implements ITServices,HardwareServices{
void getBaseCompanyDetail(){
    System.out.println("base company detail printed");
}
public void getITServices(){
    System.out.println("get IT services detail printed");
}
public  void getHardwareServices(){
    System.out.println("get hardware services detail printed");
}
}

class ChildCompany extends BaseCompany{
void getChildCompanyDetail(){
    System.out.println("child company detail printed ");
}
}

class LocalCompany extends  ChildCompany{
void getLocalCompanyDetails(){
    System.out.println("local company details printed");
}
}

class SharedCompany extends BaseCompany{
    void getSharedCompanyDetails(){
        System.out.println("shared company details printed");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        LocalCompany lc = new LocalCompany();
        lc.getLocalCompanyDetails();
        lc.getChildCompanyDetail();
        lc.getBaseCompanyDetail();
        SharedCompany sc = new SharedCompany();
        sc.getBaseCompanyDetail();
        sc.getITServices();
        sc.getHardwareServices();
    }
}
