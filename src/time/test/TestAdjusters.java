package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate ldt
            = LocalDate.of(year, month, 1);

        LocalDate firstDay = ldt.with(TemporalAdjusters.firstDayOfMonth());
        DayOfWeek dayOfWeek = firstDay.getDayOfWeek();
        System.out.println("firstDayOfWeek = " + dayOfWeek);

        LocalDate lastDay = ldt.with(TemporalAdjusters.lastDayOfMonth());
        DayOfWeek dayOfWeek1 = lastDay.getDayOfWeek();
        System.out.println("lastDayOfWeek = " + dayOfWeek1);

    }
}
