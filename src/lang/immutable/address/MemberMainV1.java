package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 a = new MemberV1("회원A", address);
        MemberV1 b = new MemberV1("회원B", address);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 주소변경
        b.getAddress().setValue("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
