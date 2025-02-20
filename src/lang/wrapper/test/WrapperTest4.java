package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer boxedInt = Integer.valueOf(str);
        System.out.println("boxedInt = " + boxedInt);
        int unboxedInt = boxedInt;
        System.out.println("unboxedInt = " + unboxedInt);
        Integer boxedInt2 = unboxedInt;
        System.out.println("boxedInt2 = " + boxedInt2);
    }
}
