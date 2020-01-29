package ConceptsCheck;

import java.util.Arrays;

public class CallingMainMethod {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        callMain();
    }
    public static void callMain() {
        main(new String[]{"ABC","DEF"});
    }
}
