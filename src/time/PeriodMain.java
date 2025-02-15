package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 날짜 계산에 사용
        LocalDate localDate = LocalDate.of(2030, 10, 10);
        LocalDate currentDatePlus = localDate.plus(period);
        System.out.println("localDate = " + localDate);
        System.out.println("currentDatePlus = " + currentDatePlus);

        // 기간 차이
        LocalDate startDate = LocalDate.of(2023, 9, 18);
        LocalDate endDate = LocalDate.of(2023, 12, 7);
        System.out.println("startDate = " + startDate);
        System.out.println("endDate = " + endDate);

        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between);
        System.out.println("기간 : " + between.getMonths() + "개월 " + between.getDays() + "일");

    }
}
