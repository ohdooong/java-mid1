package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int parseInt = Integer.parseInt(str1);
        int parseInt1 = Integer.parseInt(str2);

        System.out.println("parseInt = " + parseInt);
        System.out.println("parseInt1 = " + parseInt1);
        System.out.println("(parseInt1+parseInt) = " + (parseInt1 + parseInt));

    }
}
