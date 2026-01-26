package basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.Duration;

public class DateTime5 {
    public static void main(String[] args){
        //Data-time objects to examples
        LocalDate d01 = LocalDate.parse("2026-01-26");
        LocalDate d02 = LocalDate.parse("2026-02-03");
        LocalDateTime d03 = LocalDateTime.parse("2026-01-26T15:33:30");
        LocalDateTime d04 = LocalDateTime.parse("2026-01-30T17:15:00");
        Instant d05 = Instant.parse("2026-01-26T18:33:30Z");
        Instant d06 = Instant.parse("2026-01-29T08:05:00Z");

        //Durations
        Duration du1 = Duration.between(d01.atStartOfDay(), d02.atStartOfDay());
        Duration du2 = Duration.between(d03, d04);
        Duration du3 = Duration.between(d05, d06);

        //Infos
        System.out.println(du1.toDays());
        System.out.println(du1.toHours());
        System.out.println(du2.toDays());
        System.out.println(du2.toHours());
        System.out.println(du3.toDays());
        System.out.println(du3.toHours());

    }
}
