package lang.string.method;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";
        System.out.println("인덱스 7번째부터의 부분문자열 : " + str.substring(7));
        System.out.println("인덱스 7번째부터 12까지의의 부분문자열 : " + str.substring(7, 12));
        System.out.println("문자열 결합" + str.concat("!@#!@$!@#!@$"));
        System.out.println("'Java'를 'C'로 대체 : " + str.replace("Java", "C"));
        System.out.println("첫 번째 'Java'를 'World'로 대체 : " + str.replaceFirst("Java", "World"));
    }
}
