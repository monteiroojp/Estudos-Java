package basics;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime1 {
    public static void main(String[] args){
        //Local date
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        //Local date-time
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        //Global date-time
        Instant d03 = Instant.now();
        System.out.println(d03);

        //Parsing dates
        LocalDate d04 = LocalDate.parse("2025-01-21");
        LocalDateTime d05 = LocalDateTime.parse("2025-01-21T09:31:35.700");
        Instant d06 = Instant.parse("2025-01-21T12:31:35.900Z");
        Instant d07 = Instant.parse("2025-01-21T09:31:35.900-03:00");
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);

        //Custom dates-time
        LocalDate d08 = LocalDate.parse("21/01/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("21/01/2026 09:53", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(d08);
        System.out.println(d09);

        //Isolated parameters
        LocalDate d010 = LocalDate.of(2026, 1, 21);
        LocalDateTime d011 = LocalDateTime.of(2026, 1, 21, 10, 2, 35);
        System.out.println(d010);
        System.out.println(d011);
    }
}
