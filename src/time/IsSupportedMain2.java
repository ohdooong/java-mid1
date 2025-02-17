package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        boolean supported = localDate.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);

        if(supported) {
            int a = localDate.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("a = " + a);
        }
    }
}
