package Java8.DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public class TimeSorting {

  public static void main(String[] args) {

    ArrayList<LocalTime> timeList = new ArrayList<>();
    IntStream.range(0,10).forEach(
      i-> {
        timeList.add(
          LocalTime
            .now()
            .plus( Duration.ofMinutes( new Random().nextInt(30) ) ) );
      } );

    System.out.println(timeList);

    Collections.sort(timeList, (o1,o2) -> o1.isAfter(o2)?1:-1 );

    System.out.println("Sorted Time");
    System.out.println(timeList);

  }
}
