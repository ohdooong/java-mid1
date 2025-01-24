package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울"); // x001
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다. -> x001
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImmutableAddress("부산");
        System.out.println("부산으로 변경");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
