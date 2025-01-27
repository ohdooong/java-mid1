package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = " world";

        // 원칙적으로는 concat메서드를 사용해야한다.
        String result1 = str1.concat(str2);
        String result2 = str1 + str2;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
