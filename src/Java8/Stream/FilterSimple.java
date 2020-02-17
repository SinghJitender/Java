package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterSimple {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(3,7,34,12,56,89,53,45,78,99,234);
    List<Integer> collect = list.stream().filter(item -> item % 2 != 0).collect(Collectors.toList());
    System.out.println(collect);
  }
}
