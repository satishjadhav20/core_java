package encapsulation;

public class satishtest {


    public static void main(String[] args) {
        satish s1 = new satish(1,"sam");
        s1.setId(10);
        System.out.println(s1.getId());
        s1.setName("satish");
        System.out.println(s1.getName());
    }
}
