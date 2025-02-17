package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("firstDay = " + firstDay);
        System.out.println("lastDay = " + lastDay);




        sc.close();
    }
}
