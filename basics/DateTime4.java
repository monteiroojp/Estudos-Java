package basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DateTime4 {
    public static void main(String[] args){
            //Instances for examples
            LocalDate d01 = LocalDate.parse("2026-01-26");
            LocalDateTime d02 = LocalDateTime.parse("2026-01-26T14:58:30");
            Instant d03 = Instant.parse("2026-01-26T17:58:30Z");
            System.out.println(d01);
            System.out.println(d02);
            System.out.println(d03);

            //Minus and plus examples
            d01 = d01.plusDays(3);
            d02 = d02.plusHours(5);
            d03 = d03.minusSeconds(90);
            System.out.println(d01);
            System.out.println(d02);
            System.out.println(d03);

            //Minus and plus to specific chrono units
            d01 = d01.plus(3, ChronoUnit.DECADES);
            d02 = d02.plus(5, ChronoUnit.HALF_DAYS);
            d03 = d03.minus(9, ChronoUnit.DAYS);
            System.out.println(d01);
            System.out.println(d02);
            System.out.println(d03);
    }
}
