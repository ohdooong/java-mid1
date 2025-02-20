package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("basic 의 할인 금액 = " + basic);
        System.out.println("gold 의 할인 금액 = " + gold);
        System.out.println("diamond 의 할인 금액 = " + diamond);
    }
}
