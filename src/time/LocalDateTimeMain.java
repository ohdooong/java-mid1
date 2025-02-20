package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(2016, 1, 25, 13, 4, 20);
        System.out.println("nowDt = " + nowDt);
        System.out.println("localDateTime = " + localDateTime);

        // 날짜와 시간 분리
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("localTime = " + localTime);

        LocalDateTime sumDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("sumDateTime = " + sumDateTime);

        // 계산 불변
        LocalDateTime localDateTimePlus = localDateTime.plusDays(1000);
        System.out.println("localDateTimePlus = " + localDateTimePlus);
        LocalDateTime plusYears = localDateTime.plusYears(1);
        System.out.println("plusYears = " + plusYears);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(localDateTime));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(localDateTime));
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? " + nowDt.isEqual(localDateTime));

    }
}
