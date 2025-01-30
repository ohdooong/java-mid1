package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object o = new Object();
        String str = "Hello, Java!";

        //valueOf 메서도
        String numString = String.valueOf(num);
        System.out.println("numValue = " + numString);

        String boolString = String.valueOf(bool);
        System.out.println("boolString = " + boolString);

        String objString = String.valueOf(o);
        System.out.println("objString = " + objString);

        // 문자 + x -> 문자
        String numString2 = "" + num;
        System.out.println("numString2 = " + numString2);

        // toCharArray 메서드 => 문자열을 문자배열로 변환
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            System.out.print(c);
        }
    }
}
