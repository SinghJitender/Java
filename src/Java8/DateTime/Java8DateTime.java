package Java8.DateTime;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Java8DateTime {
  public static void main(String[] args) {

    DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("hh:mm:ss");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY hh:mm:ss");
    LocalDate localDate = LocalDate.now();

    LocalTime localTime = LocalTime.now();

    System.out.println("Local Time : "+localTime);

    System.out.println("Local Date : "+localDate.toString());

    System.out.println(formatter.format(localDate));

    System.out.println(timeformatter.format(localTime));

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("Local Date Time : "+localDateTime);
    System.out.println(dateTimeFormatter.format(localDateTime));

  }
}
