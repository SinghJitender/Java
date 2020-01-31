package Java8.Stream;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByUsingStream {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>();
        table.put("Jitu","Developer");
        table.put("Jitender","QA");
        table.put("Rahul","QA");
        table.put("Rohit","DevOps");
        table.put("Virat","Developer");
        table.put("Shreyas","QA");

        List items = Arrays.asList("QA","Developer","DevOps","QA","Developer","DevOps","QA","Developer","DevOps","Developer","DevOps","Developer","DevOps","DevOps","DevOps","DevOps");

        System.out.println(table.keySet().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        System.out.println(table.keySet().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.toSet())));
        System.out.println(items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

    }
}
