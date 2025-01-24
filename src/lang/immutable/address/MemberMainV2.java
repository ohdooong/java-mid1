package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 a = new MemberV2("회원A", address);
        MemberV2 b = new MemberV2("회원B", address);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 주소변경
        // b.getAddress().setValue("부산"); -> 컴파일에러
        b.setAddress(new ImmutableAddress("부산"));
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
