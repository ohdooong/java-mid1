package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; // 대문자 일부가 있음.
        String str2 = "hello, java!"; // 소문자로문 되어있음.
        String str3 = "Hello, World!";

        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a'" + "b".compareTo("a"));
        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with 'Hello' : " + str1.startsWith("Hello"));
        System.out.println("str1 ends With 'Java!' : " + str1.endsWith("Java!"));

    }
}
