package Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class ComplexGroupByJava {
    public static void main(String[] args) {

        List<Product> listOfProducts = Arrays.asList(
                new Product.Builder("OnePlus 7",100,
                        Category.ELECTRONIC,32000.00,"Just a smartphone. Faster than OnePlus 6T","Jitender",
                        10.00).setColor(Color.BLACK).build(),
                new Product.Builder("OnePlus 7T",110,
                        Category.ELECTRONIC,39000.00,"Just a smartphone. Faster than OnePlus 7"
                        ,"Jitender", 12.00).setColor(Color.BLACK).build(),
                new Product.Builder("OnePlus 7 Pro",80,
                        Category.ELECTRONIC,50000.00,"Just another smartphone. Faster than OnePlus 7"
                        ,"Jitu", 20.00).setColor(Color.BLACK).build(),
                new Product.Builder("OnePlus 6T",50,
                        Category.ELECTRONIC,28000.00,"Just a smartphone. Faster than OnePlus 6"
                        ,"Jitender", 12.00).setColor(Color.BLACK).build(),
                new Product.Builder("OnePlus 6",20,
                        Category.ELECTRONIC,26000.00,"Just a smartphone."
                        ,"Jitu", 12.00).setColor(Color.BLACK).build(),
                new Product.Builder("Puma Shoes",150,
                        Category.FASHION,2800.00,"Running Shoes"
                        ,"Sukhmani", 25.00).setColor(Color.RED).build(),
                new Product.Builder("Adidas Shoes",250,
                        Category.FASHION,1500.00,"Walking Shoes"
                        ,"Sukhmani", 30.00).setColor(Color.ORANGE).build(),
                new Product.Builder("RedTape Shoes",250,
                        Category.FASHION,700.00,"Walking Shoes"
                        ,"Sukhmani", 10.00).setColor(Color.BLACK).build(),
                new Product.Builder("Shorts",500,
                        Category.FASHION,300.00,"Cotton Shorts"
                        ,"Sukhmani", 30.00).setColor(Color.BLUE).setSize(Size.LARGE).build(),
                new Product.Builder("Shorts",140,
                        Category.FASHION,300.00,"Cotton Shorts"
                        ,"Sukhmani", 30.00).setColor(Color.BLUE).setSize(Size.SMALL).build(),
                new Product.Builder("Shorts",300,
                        Category.FASHION,300.00,"Cotton Shorts"
                        ,"Sukhmani", 30.00).setColor(Color.BLUE).setSize(Size.MEDIUM).build(),
                new Product.Builder("Sports Shorts",1000,
                        Category.FASHION,500.00,"Nylon Shorts"
                        ,"Sukhmani", 50.00).setColor(Color.BLACK).setSize(Size.MEDIUM).build(),
                new Product.Builder("Sports Shorts",1200,
                        Category.FASHION,500.00,"Nylon Shorts"
                        ,"Sukhmani", 50.00).setColor(Color.BLACK).setSize(Size.EXTRA_LARGE).build(),
                new Product.Builder("Samsung S7",500,
                        Category.ELECTRONIC,72000.00,"Smartphone which hangs alot."
                        ,"Sukhmani", 10.00).setColor(Color.BLUE).build(),
                new Product.Builder("The Art of War",500,
                        Category.BOOKS,600.00,"Know how to lose a war."
                        ,"Prachi", 20.00).setAuthorName("Rohit").build(),
                new Product.Builder("PEACE",200,
                        Category.BOOKS,200.00,"Know how to live in peace."
                        ,"Prachi", 10.00).setAuthorName("King").build(),
                new Product.Builder("HC Verma",500,
                        Category.BOOKS,600.00,"Suck at Physics"
                        ,"Prachi", 15.00).setAuthorName("VermaJi").build(),
                new Product.Builder("RD Sharma",500,
                        Category.BOOKS,700.00,"Screw you at 12 Maths"
                        ,"Prachi", 10.00).setAuthorName("SharmaJi").build()
        );

        System.out.println("Group By Product Category");
        Map<Category, List<Product>> categoryListMap = groupByCategory(listOfProducts);
        for(Category category: categoryListMap.keySet()) {
            System.out.println(category + " : ");
            for(Product product : categoryListMap.get(category)) {
                System.out.println("[ "+ product+" ]");
            }
        }
        //System.out.println(groupByCategory(listOfProducts));


    }

    public static Map<Category,List<Product>> groupByCategory(List<Product> listOfProduct) {
        return listOfProduct.stream().collect(Collectors.groupingBy(Product::getCategory));
    }
}

class Product {
    private static int id=0;
    private String productName;
    private int quantity;
    private Category category;
    private double price;
    private String description;
    private Color color;
    private String sellerName;
    private String authorName;
    private Size size;
    private double discount;

    public Product(Builder builder) {
        this.productName = builder.productName;
        this.quantity = builder.quantity;
        this.category = builder.category;
        this.price = builder.price;
        this.description = builder.description;
        this.color = builder.color;
        this.sellerName = builder.sellerName;
        this.authorName = builder.authorName;
        this.size = builder.size;
        this.discount = builder.discount;
        id=id+1;
    }

    public static int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Color getColor() {
        return color;
    }

    public String getSellerName() {
        return sellerName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Size getSize() {
        return size;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", category=" + category +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", color=" + color +
                ", sellerName='" + sellerName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", size=" + size +
                ", discount=" + discount +
                '}';
    }

    public static class Builder {

        private String productName;
        private int quantity = 0;
        private Category category;
        private double price;
        private String description;
        private Color color = Color.NA;
        private String sellerName;
        private String authorName="";
        private Size size = Size.NA;
        private double discount = 0.0;

        public Builder(String productName, int quantity, Category category, double price, String description, String sellerName, double discount) {
            this.productName = productName;
            this.quantity = quantity;
            this.category = category;
            this.price = price;
            this.description = description;
            this.sellerName = sellerName;
            this.discount = discount;
        }

        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public Builder setSize(Size size) {
            this.size = size;
            return this;
        }

        public Product build() {
            return new Product(this); }
        }

}

enum Size {
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE,
    NA
}

enum Category {
    ELECTRONIC,
    BOOKS,
    SPORTS,
    FASHION,
    OTHER
}

enum Color {
    RED,
    BLUE,
    BLACK,
    GREEN,
    PINK,
    YELLOW,
    ORANGE,
    OTHER,
    NA
}
