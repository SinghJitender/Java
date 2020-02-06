package Java8.Stream;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ComplexGroupByJava {
    private static List<Product> listOfProducts;
    static {
       listOfProducts = Arrays.asList(
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

    }
    public static void main(String[] args) {

        System.out.println("Group By Product Category");
        Map<Category, List<Product>> categoryListMap = groupByCategory();
        for(Category category: categoryListMap.keySet()) {
            System.out.println(category + " : ");
            for(Product product : categoryListMap.get(category)) {
                System.out.println("["+ product+"]");
            }
        }

        System.out.println("\n\nGroup By Seller Name");
        Map<String, List<Product>> groupBySellerName = groupBySellerName();
        for(String name : groupBySellerName.keySet()) {
            System.out.println(name + " : ");
            for(Product product : groupBySellerName.get(name)) {
                System.out.println("["+ product+"]");
            }
        }

        System.out.println("\n\nSeller who sells in more than 'X' number of categories. (Here X = 1)");
        System.out.println(sellerInMoreThanXCategory(1));

        System.out.println("\n\nSeller and categories they sell in");
        Map<String, Set<Category>> sellerAndCategory = sellerAndCategory();
        for(String sellerName : sellerAndCategory.keySet()) {
            System.out.println(sellerName +" : "+ sellerAndCategory.get(sellerName));
        }

        System.out.println("\n\nProducts with discount more than 'X%'. Here X is 18");
        List<Product> products = productsWithDiscount(18.00);
        for(Product p : products){
            System.out.println("["+p+"]");
        }

        System.out.println("\n\nShow Name,Price and Description - Group By Category and Color");
        Map<Category, Map<Color, Set<Object[]>>> categoryColorMap = groupByCategoryAndColor();
        for(Category category : categoryColorMap.keySet()) {
            System.out.println(category);
            for(Color color : categoryColorMap.get(category).keySet()) {
                System.out.println("\t"+color);
                for(Object[] o : categoryColorMap.get(category).get(color)) {
                    System.out.println("\t\t"+Arrays.toString(o));
                }
            }
        }



    }

    public static Map<Category,Map<Color,Set<Object[]>>> groupByCategoryAndColor() {
        return listOfProducts.stream().collect(Collectors.groupingBy(Product::getCategory,
          Collectors.groupingBy(Product::getColor,
            Collectors.mapping(product -> {
                return new Object[]{product.getProductName(),product.getPrice(), product.getDescription()};
            },Collectors.toSet()))));
    }

    public static List<Product> productsWithDiscount(double x) {
        return listOfProducts.stream().filter(product -> product.getDiscount()>=x).collect(Collectors.toList());
    }


    public static Set<String> sellerInMoreThanXCategory(int x) {
        Map<String, Set<Category>> sellerGroupedByCategory = listOfProducts.stream().collect(Collectors.groupingBy(Product::getSellerName,
                Collectors.mapping(Product::getCategory, Collectors.toSet())));
       return sellerGroupedByCategory.keySet().stream().filter(key -> sellerGroupedByCategory.get(key).size()>x)
               .collect(Collectors.toSet());
    }

    public static  Map<String, Set<Category>> sellerAndCategory() {
        return listOfProducts.stream().collect(Collectors.groupingBy(Product::getSellerName,
          Collectors.mapping(Product::getCategory, Collectors.toSet())));
    }

    public static Map<Category,List<Product>> groupByCategory() {
        return listOfProducts.stream().collect(Collectors.groupingBy(Product::getCategory));
    }

    public static Map<String,List<Product>> groupBySellerName() {
        return listOfProducts.stream().collect(Collectors.groupingBy(Product::getSellerName));
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
        return "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", category=" + category +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", color=" + color +
                ", sellerName='" + sellerName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", size=" + size +
                ", discount=" + discount ;
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
