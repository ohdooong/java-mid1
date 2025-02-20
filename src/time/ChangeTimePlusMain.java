package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 2, 10, 16, 30, 30);
        System.out.println("dt = " + dt);

        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDt1 = " + plusDt1);

        Period period = Period.ofYears(10);
        LocalDateTime plusDt2 = dt.plus(period);
        System.out.println("plusDt2 = " + plusDt2);
    }

}
