package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        enumeration.ex1.DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("basic 의 할인 금액 = " + basic);
        System.out.println("gold 의 할인 금액 = " + gold);
        System.out.println("diamond 의 할인 금액 = " + diamond);
    }
}
