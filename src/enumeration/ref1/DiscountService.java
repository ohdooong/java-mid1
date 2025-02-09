package enumeration.ref1;


import static enumeration.ref1.ClassGrade.*;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }
}
