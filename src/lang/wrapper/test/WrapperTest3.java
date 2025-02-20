package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer 변환
        Integer parseInt = Integer.valueOf(str);
        System.out.println("parseInt = " + parseInt);

        // Integer -> int 변환
        int unboxedInt = parseInt.intValue();
        System.out.println("unboxedInt = " + unboxedInt);

        // int -> Integer 변환
        Integer boxedInt = Integer.valueOf(unboxedInt);
        System.out.println("boxedInt = " + boxedInt);



    }
}
