package Strings;

public class Demo4 {
    public static void main(String[] args) {
        String str1 = "satish";
        String str2 = "Akanksha";
        String str3 = new String("satish");

        System.out.println("***** by using == *****");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

        System.out.println("***** by using .equals method *****");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

        System.out.println("***** by using compareTo() method");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str2.compareTo(str3));

        String str4 ="A";
        String str5 = "S";
        System.out.println(str4.compareTo(str5));
    }
}
