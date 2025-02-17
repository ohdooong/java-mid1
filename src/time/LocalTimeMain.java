package time;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime localTime = LocalTime.of(9, 10, 10);

        System.out.println("nowTime = " + nowTime);
        System.out.println("localTime = " + localTime);

        // 계산 (불변)
        localTime = localTime.plusMinutes(10);
        System.out.println("10분더한 localTime = " + localTime);
    }

}
