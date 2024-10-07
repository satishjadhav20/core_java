package Strings;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = new String("satish");
        String str2 = new String("satish");
        String str3 = new String("satish");
        String str4 = new String("satish");
        String str5 = new String("satish");
        String str6 = "satish";

        //all are heap and last are scp(String constant pool)
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str1 == str5);
        System.out.println(str1 == str6);
    }
}
