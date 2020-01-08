package Java8.FunctionalInterfaces;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> consumer =  c -> System.out.println(c+2);
        integers.stream().forEach(consumer);


        Employee e1 = new Employee(10,"Jitu");
        Employee e2 = new Employee(9,"Jti");
        Employee e3 = new Employee(16,"Jitender");
        Employee e4 = new Employee(13,"Jagi");
        Collection<Employee> employees = Arrays.asList(e1,e2,e3,e4);

        Consumer<Employee> employeeConsumer =  c -> System.out.println(c);
        employees.stream().forEach(employeeConsumer);


    }
}
