package DesignPatterns;

public class AndSpecification<T> implements Specification<T> {

    Specification<T> left;
    Specification<T> right;

    public AndSpecification(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean compare(T t) {
        return left.compare(t) && right.compare(t);
    }
}
