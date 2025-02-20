package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int a = localDate.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("a = " + a);
    }
}
