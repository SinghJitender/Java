package DesignPatterns;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean compare(Product product) {
        return product.getColor()==color;
    }
}
