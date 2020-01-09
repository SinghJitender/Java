package DesignPatterns;

import java.util.stream.Collectors;

public class Product {
    private String name;
    private Size size;
    private Type type;
    private Color color;

    public Product(String name, Size size, Type type, Color color) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }
}

enum Size {
    SMALL,
    MEDIUM,
    LAREG
}

enum Type {
    SHIRT,
    TSHIRT,
    PANTS
}

enum Color {
    RED,
    GREEN,
    BLUE,
    PINK
}

