package lab.bjes.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class TimeLab {
    public TimeLab() {
        localDateParsing();
        localDateTimeParsing();
        periods();
        durations();
    }


    private void localDateParsing() {
        System.out.println("--- LocalDate - Parsing");
        System.out.println("Can create a LocalDate using parse, with a datestamp (without time)");
        System.out.println("LocalDate.parse(\"2022-12-31\"): " + LocalDate.parse("2022-12-31"));

        System.out.println("Can also use LocalDate.of(), using ints: ");
        System.out.println("LocalDate.of(1492, 10, 12): " + LocalDate.of(1492, 10, 12));
    }
    private void localDateTimeParsing() {
        System.out.println("--- LocalDateTime - Parsing");
        System.out.println("LocalDateTime requires both Date and Time. ");

        try {
            LocalDateTime localDateTime = LocalDateTime.parse("2012-10-11");
            System.out.println("Time was: " + localDateTime);
        } catch(DateTimeParseException e) {
            System.out.println("DateTimeParseException caught when trying to parse: 2012-10-11");
        }
        System.out.println("Can use LocalDateTime.parse() on a complete datetime");
        System.out.println("LocalDateTime.parse(\"2012-10-11T13:37:00\"): " + LocalDateTime.parse("2012-10-11T13:37:00"));
        System.out.println("Can also create LocalDateTime.of(), using ints: ");
        System.out.println("LocalDateTime.of(2015, 12, 1, 10, 10, 5): " + LocalDateTime.of(2015, 12, 1, 10, 10, 5));

    }

    private void periods() {
        System.out.println("--- Periods");
        System.out.println("Periods uses date based values contain a year, month and time. It looks like P2YM315D. If for example the days would be 0, the D would be missing completely. ");
        System.out.println("A Period can be created using Period.of(years, months, days)");
        System.out.println("Period.of(2, 0, 15): " + Period.of(2, 0, 15));

        System.out.println("A Period can be created using Period.between() with 2 LocalDate:s");
        System.out.println("Period.between(LocalDate.parse(\"2023-10-10\"), LocalDate.of(2013,11,11)): " + Period.between(LocalDate.parse("2023-10-10"), LocalDate.of(2013,11,11)));

        System.out.println("If a Period.between, has an earlier LocalDate in the second param, it will contain denote the period as negative using -. Examples: ");
        System.out.println("Period.between(LocalDate.parse(\"2023-10-10\"), LocalDate.parse(\"2023-08-09\")): " + Period.between(LocalDate.parse("2023-10-10"), LocalDate.parse("2023-08-09"))); // P-M2-D1
        System.out.println("Period.between(LocalDate.parse(\"2023-10-10\"), LocalDate.parse(\"2023-08-11\")): " + Period.between(LocalDate.parse("2023-10-10"), LocalDate.parse("2023-08-11"))); // P-1M-30D
        System.out.println("Period.between(LocalDate.parse(\"2023-10-10\"), LocalDate.parse(\"2023-12-09\")): " + Period.between(LocalDate.parse("2023-10-10"), LocalDate.parse("2023-12-09"))); // P1M30D

        System.out.println("The Periods members can be retrieved with getters. A period of 1 year and 1 month will return 1 in getMonth(), and not 13. ");
        Period p = Period.of(2, 3, 0);
        System.out.println("Period p = Period.of(2, 3, 0);");
        System.out.println("p.getDays(): " + p.getDays()); // 0
        System.out.println("p.getMonths(): " + p.getMonths()); // 3
        System.out.println("p.getYears(): " + p.getYears()); // 2


        System.out.println("Can also create Periods by using Period.of{Unit}");
        System.out.println("It will create a Period with a given unit and its value. The other 2 members will be 0. ");
        System.out.println("Period.ofMonths(-5): " + Period.ofMonths(-5));
        System.out.println("Period.ofYears(10): " + Period.ofYears(10));

        // add DST examples
    }

    private void durations() {
        System.out.println("--- Durations");
        System.out.println("While Periods uses date-based values. Duration uses time-based values");
        System.out.println("When using Durations, a day is always 24 hours and will never take DST into account. ");

        // 
        Duration.ofHours(10);
    }
}
