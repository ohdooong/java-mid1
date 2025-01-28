package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

//        String[] strings = str.split(" ");
//        int count = 0;
//        for (String string : strings) {
//            if (string.equals(key)) {
//                count++;
//            }
//        }
//        System.out.println("count = " + count);

        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
