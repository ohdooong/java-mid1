package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "      hello  java   ";
        String trimmed = original.trim();
        System.out.println("trimmed = " + trimmed);

        String stripped = original.strip();
        System.out.println("stripped = " + stripped);

    }
}
