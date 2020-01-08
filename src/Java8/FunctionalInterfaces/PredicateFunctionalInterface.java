package Java8.FunctionalInterfaces;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {

        //simple Predicate.
        Predicate<String> predicate = s -> s.length()>1;
        System.out.println(predicate.test("ABC"));

        Employee e1 = new Employee(10,"Jitu");
        Employee e2 = new Employee(9,"Jti");
        Employee e3 = new Employee(16,"Jitender");
        Employee e4 = new Employee(13,"Jagi");

        Collection<Employee> employees = Arrays.asList(e1,e2,e3,e4);
        //Predicate of type Employee. Checks if employee age is greater than 10 and return boolean value based upon that.
        Predicate<Employee> employeePredicate = e -> e.getAge()>10;

        employees.stream().filter(employeePredicate).forEach( e -> System.out.println(e.getName()));



    }
}
