/*  Create a method to accept date and print the duration in days, months and years with regards to current system date. */
package Lab3;
import java.time.*;
import java.util.*;
public class Excercise6 {
    public static void main(String[] args)
    {
        LocalDate pdate = LocalDate.of(2012, 01, 01);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(pdate, now);

        System.out.printf("\nDifference is %d years, %d months and %d days old\n\n",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}
