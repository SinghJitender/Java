package Java8.FunctionalInterfaces;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionFunctionalInterface {

    public static void main(String[] args) {

        Function<Integer, Integer> function = number -> number*number;
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> collect = integers.stream().map(function).collect(Collectors.toList());
        System.out.println(collect);

        Employee e1 = new Employee(10,"Jitu");
        Employee e2 = new Employee(9,"Jti");
        Employee e3 = new Employee(16,"Jitender");
        Employee e4 = new Employee(13,"Jagi");

        Collection<Employee> employees = Arrays.asList(e1,e2,e3,e4);

        Function<Employee,Employee> employeeIntegerFunction = employee -> { return employee.getName().contains("Ji")?employee:null; };
        employees.stream().map(employeeIntegerFunction).forEach( e->  { if(e!=null) System.out.println(e.getName());});

    }
}
