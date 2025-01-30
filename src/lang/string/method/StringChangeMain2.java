package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "      Java Programming     ";
        System.out.println("소문자 : " + strWithSpaces.toLowerCase());
        System.out.println("대문자 : " + strWithSpaces.toUpperCase());
        System.out.println("공백제거 trim : " + strWithSpaces.trim()); // white space만 제거
        System.out.println("공백제거 strip : " + strWithSpaces.strip()); // white space, 유니코드 공백 포함 제거
        System.out.println("앞 공백제거 : " + strWithSpaces.stripLeading());
        System.out.println("뒷 공백제거 : " + strWithSpaces.stripTrailing());
    }
}
