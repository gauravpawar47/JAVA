package com.company;
import java.time.*;

public class _100_Date_Time
{
    public static void main(String[] args)
    {
        Clock c1 = Clock.systemDefaultZone();
        Clock c2 = Clock.systemUTC();
        Duration d1 = Duration.between(LocalTime.MIN , LocalTime.NOON);
        Duration d2 = Duration.between(LocalTime.MAX , LocalTime.MIN);

        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.parse("2021-05-27");
        LocalDate ld3 = LocalDate.parse("2021-06-26");
        LocalDate ld4 = LocalDate.parse("2021-06-26");

        System.out.println(c1.getZone());
        System.out.println(c2.instant());

        System.out.println(d1.isNegative());
        System.out.println(d2.isNegative());
        System.out.println(d1.isZero());
        System.out.println(d2.isZero());

        System.out.println(ld);
        System.out.println(ld3.equals(ld2));
        System.out.println(ld4.equals(ld3));
    }
}