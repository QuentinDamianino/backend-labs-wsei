package lab1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Task5 {

    public static void main(String[] args) {
        displayLocalTime();
        System.out.println("-------------------");
        displayGlobalTime();
    }

    public static void displayLocalTime()
    {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();

        System.out.println(dateTimeFormatter.format(now));
    }

    public static void displayGlobalTime()
    {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss").withZone(ZoneId.systemDefault());

        Instant now = Instant.now();

        System.out.println(dateTimeFormatter.format(now));
    }
}
