package basics;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTime3 {
    public static void main(String[] args){
        //Global data-time
        Instant d01 = Instant.parse("2025-01-21T12:31:35.900Z");

        //Conversion
        LocalDate d02 = LocalDate.ofInstant(d01, ZoneId.systemDefault());
        LocalDateTime d03 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());

        //Output
        System.out.println(d02);
        System.out.println(d03);

        //Get infos from data-time
        System.out.println(d02.getDayOfMonth());
        System.out.println(d02.getDayOfWeek());
        System.out.println(d03.getHour());

        //LocalDate
        LocalDate d04 = LocalDate.parse("2026-01-26");
        System.out.println(d04);

        //Conversion to LocalDateTime
        LocalDateTime d05 = d04.atTime(15, 30);
        LocalDateTime d06 = d04.atStartOfDay();
        System.out.println(d05);
        System.out.println(d06);

    }
}
