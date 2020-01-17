package ConceptsCheck;

import java.util.*;

public class ComparatorConcept {
    public static void main(String[] args) {
        WantSorting one = new WantSorting(1,"A",2016);
        WantSorting two = new WantSorting(2,"B",2015);
        WantSorting three = new WantSorting(3,"C",2017);
        WantSorting four = new WantSorting(4,"D",2016);
        WantSorting five = new WantSorting(4,"E",2015);
        WantSorting six = new WantSorting(4,"A",2015);
        WantSorting seven = new WantSorting(4,"D",2015);

        List<WantSorting> list = Arrays.asList(four,three,two,one,seven,six,five);

        System.out.println("Before Sorting : "+ list);

        Collections.sort(list);
        System.out.println("After Sorting : "+ list);
    }
}

class WantSorting implements Comparable {

    private int id;
    private String name;
    private int yearOfJoining;
    private static final Comparator<WantSorting> COMPARATOR = Comparator
                .comparingInt((WantSorting sort) -> sort.getId())
                .thenComparingInt(sort -> sort.getYearOfJoining())
                .thenComparing(sort -> sort.getName());

    public WantSorting(int id, String name, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.yearOfJoining = yearOfJoining;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    @Override
    public String toString() {
        return "WantSorting{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        WantSorting obj = (WantSorting) o ;
        //return obj.getId()>this.id?-1:1;
        return COMPARATOR.compare(this,obj);
    }
}
