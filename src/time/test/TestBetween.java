package time.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2025, 2, 17);
        LocalDate endDate = LocalDate.of(2025, 12, 31);

        Period period = Period.between(startDate, endDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days1 = period.getDays();
        System.out.println(years + "년 " + months + "개월 " + days1 +"일");

        long between = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("디데이 = " + between);

//        Duration duration = Duration.between(startDate, endDate);
//        long days2 = duration.toDays();
//        System.out.println("디데이 : " + days2);

    }
}
