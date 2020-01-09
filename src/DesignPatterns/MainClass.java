package DesignPatterns;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Product product1 = new Product("Gucci",Size.MEDIUM,Type.SHIRT,Color.RED);
        Product product2 = new Product("Armani",Size.MEDIUM,Type.SHIRT,Color.BLUE);
        Product product3 = new Product("H&M",Size.LAREG,Type.SHIRT,Color.GREEN);
        Product product4 = new Product("Polo",Size.SMALL,Type.TSHIRT,Color.RED);
        Product product5 = new Product("Levis",Size.SMALL,Type.PANTS,Color.RED);
        Product product6 = new Product("Round Neck",Size.SMALL,Type.TSHIRT,Color.PINK);

        List<Product> products = Arrays.asList(product1, product2, product3, product4, product5, product6);

        ProductFilter productFilter = new ProductFilter();
        System.out.println("Filter by size " +Size.MEDIUM);
        productFilter.filter(products,new SizeSpecification(Size.MEDIUM)).forEach( p -> System.out.println(p.getName()));
        System.out.println("\nFilter by color "+ Color.RED);
        productFilter.filter(products,new ColorSpecification(Color.RED)).forEach( p -> System.out.println(p.getName()));
        System.out.println("\nFilter by color "+Color.RED+ " and size "+ Size.MEDIUM);
        productFilter.filter(products,new AndSpecification<>(new SizeSpecification(Size.MEDIUM), new ColorSpecification(Color.RED))).forEach( p -> System.out.println(p.getName()));




    }
}


