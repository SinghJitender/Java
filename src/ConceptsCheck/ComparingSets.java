package ConceptsCheck;

import java.util.HashSet;
import java.util.Set;

public class ComparingSets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Jitu");
        set.add("jitender");

        Set<String> set2 = new HashSet<>();
        set2.add("Jitu");
        set2.add("jitender");

        Set<String> set3;
        set3 = set;

        System.out.println(set == set2);
        System.out.println(set == set3);
    }
}
