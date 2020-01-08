package Java8.FunctionalInterfaces;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SupplierFunctionalInterface {

    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> new Random().nextInt(100);
        IntStream.range(0,10).forEach( i -> System.out.println(supplier.get()));

    }
}
