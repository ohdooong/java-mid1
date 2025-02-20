package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate localDate = LocalDate.of(2023, 11, 21);
        System.out.println("localDate = " + localDate);

        // 계산 불변
        localDate = localDate.plusDays(10);
        System.out.println("localDate = " + localDate);
    }

}
