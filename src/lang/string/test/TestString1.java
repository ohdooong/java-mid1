package lang.string.test;

public class TestString1 {
    private static final String HTTPS_PREFIX = "https://";
    public static void main(String[] args) {
        String url = "https://www.example.com";
        if (url.startsWith(HTTPS_PREFIX)) {
            System.out.println("https://로 시작합니다.");
        } else {
            System.out.println("http://로 시작하지 않습니다.");
        }
    }
}
