package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 사이드 이펙트 해결방법
        // 참조형 변수를 2개 선언
        Address a = new Address("서울");
        Address b = new Address("서울");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산변경");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
