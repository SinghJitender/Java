package Java8.DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.*;
import java.util.stream.IntStream;

public class DateSorting {
  public static void main(String[] args) {
    ArrayList<LocalDate> dateList = new ArrayList<>();
    IntStream.range(0,10).forEach(
      i-> {
        dateList.add(
          LocalDate
            .now()
            .plus( Period.
              ofDays( new Random().nextInt(30) ) ) );
      } );

    System.out.println(dateList);

    Collections.sort(dateList, (o1, o2) -> o1.isAfter(o2) ? 1 : -1);

    System.out.println("Sorted List");
    System.out.println(dateList);
  }
}
