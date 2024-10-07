package Strings;

public class Demo5 {
    public static void main(String[] args) {
        String str ="Tony Stark";
        System.out.println("size of this string "+str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        str=str.concat(" marvel king");
        System.out.println(str);

        String str2 = "i love king kohli";
        str2=str2.toUpperCase();
        System.out.println(str2);

        String str3 = "BCCI CAPTAIN : ROHIT SHARMA";
        str3=str3.toLowerCase();
        System.out.println(str3);

        str3=str3.replace('a','@');
        System.out.println(str3);

        String str4 = "Narendra Modi";
        String substring = str4.substring(0,5);
        System.out.println(substring);

        String str5 = "     I am java dev.     ";
        str5=str5.trim();
        System.out.println(str5);
        System.out.println(str5.indexOf('I'));

        String str6 = "Satish";
        System.out.println(str6.indexOf('a'));
        System.out.println(str6.lastIndexOf('a'));


    }
}
