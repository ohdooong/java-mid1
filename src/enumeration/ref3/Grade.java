package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40);
    private final int discountPerent;

    // enum은 접근제한자를 붙이는게 불가능하다.
    Grade(int discountPerent) {
        this.discountPerent = discountPerent;
    }

    public int getDiscountPerent() {
        return discountPerent;
    }

    // 할인계산 메서드 추가 리팩터링
    public int discount(int price) {
        return price * this.discountPerent / 100;
    }

}
