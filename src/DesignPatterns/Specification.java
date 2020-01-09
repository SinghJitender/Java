package DesignPatterns;

public interface Specification<T> {
    boolean compare(T t);
}
