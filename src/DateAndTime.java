import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateAndTime {
    public static void main(String[] args) {
        //Examples on working with date and time in Java

        LocalDate date = LocalDate.now();
        System.out.println("Today's date: "+date);
        LocalTime time = LocalTime.now();
        System.out.println("Current time: "+time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Both combined: "+dateTime);
        Instant instant = Instant.now();
        System.out.println("Current date and time in UTC (Instant): "+instant);

        //Let's try a custom format

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Date in dd:mm:yyyy HH:mm:ss format: "+dateTime.format(formatter));

        // instead of "now()" we can create a custom datetime object

        // Christmas of 2025
        date = LocalDate.of(2025, 12, 25);
        System.out.println("Christmas od 2025 was on: " + date);
        // New year datetime
        dateTime = LocalDateTime.of(2026,01,01,00,00,00);
        System.out.println("Happy New Year: "+ dateTime);

        if(date.isBefore(ChronoLocalDate.from(dateTime))){
            System.out.println(date +" is earlier than "+ dateTime);
        } else if (dateTime.isBefore(date.atStartOfDay())) {
            System.out.println("not happening");
        } else if (dateTime.isEqual(date.atStartOfDay())) {
            System.out.println("not happening");
        }
    }
}
