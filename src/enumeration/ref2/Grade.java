package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);
    private final int discountPerent;

    // enum은 접근제한자를 붙이는게 불가능하다.
    Grade(int discountPerent) {
        this.discountPerent = discountPerent;
    }

    public int getDiscountPerent() {
        return discountPerent;
    }
}
