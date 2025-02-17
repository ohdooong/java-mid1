package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        // 포맷팅 : 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println("formatted = " + formatted);

        // 파싱 : 문자를 날짜와 시간으로
        String dateTimeString = "2025-02-17 23:15:12";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("parsedDateTime = " + parsedDateTime);
    }
}
