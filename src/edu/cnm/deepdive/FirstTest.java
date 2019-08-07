package edu.cnm.deepdive;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class FirstTest {

  public static void main(String[] args) {

    Period fromUnits = Period.of(3, 10, 40);
    System.out.println("fromUnits: " + fromUnits);
    Period fromDays = Period.ofDays(50);
    System.out.println("fromDays: " + fromDays);
    Period fromMonths = Period.ofMonths(13);
    System.out.println("fromMonths: " + fromMonths);
    Period fromYears = Period.ofYears(10);
    System.out.println("fromYears: " + fromYears);
    Period fromWeeks = Period.ofWeeks(40);
    System.out.println("fromWeeks: " + fromWeeks);

    LocalDate startDate = LocalDate.of(2014, 3, 20);
    LocalDate endDate = LocalDate.of(2015, 4, 19);

    Period period = Period.between(startDate, endDate);
    System.out.println("Years:" + period.getYears() +
        " months:" + period.getMonths() +
        " days:"+period.getDays());

    LocalTime start = LocalTime.of(1, 20, 25, 1024);
    LocalTime end = LocalTime.of(3, 22, 27, 1544);

    System.out.println(Duration.between(start, end).getSeconds());

    Duration fromChar1 = Duration.parse("P1DT1H10M10.5S");
    System.out.println("fromChar1: " + fromChar1);
    Duration fromChar2 = Duration.parse("PT10M");
    System.out.println("fromChar2: " + fromChar2);

  }

}
