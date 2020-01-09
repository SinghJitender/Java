package DesignPatterns;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> product, Specification<Product> specification) {
        return product.stream().filter( p -> specification.compare(p)) ;
    }
}
