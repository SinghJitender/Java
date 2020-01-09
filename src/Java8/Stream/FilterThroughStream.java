package Java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterThroughStream {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        IntStream.range(0, 100).forEach(i -> list.add(new Random().nextInt(1000)));
        System.out.println(list);

        List<Integer> collect = list.stream().filter(item -> item > 100).collect(Collectors.toList());
        System.out.println(collect);
    }
}
