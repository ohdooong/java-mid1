package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(15);
        System.out.println("duration = " + duration);

        LocalTime localTime = LocalTime.of(22, 0);
        System.out.println("localTime = " + localTime);

        // 계산에 사용
        LocalTime plusTime = localTime.plus(duration);
        System.out.println("plusTime = " + plusTime);

        LocalTime start = LocalTime.of(13, 0);
        LocalTime end = LocalTime.of(17, 32);
        Duration between = Duration.between(start, end);
        System.out.println("between = " + between);
        long seconds = between.getSeconds();
        System.out.println("seconds = " + seconds);
        System.out.println("근무 시간 : " + between.toHours() + "시간 " + between.toMinutesPart() + "분");


    }
}
