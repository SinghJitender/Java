package Algorithms.Strings;

public class BruteForceStringMatching {

    public static void main(String[] args) {
        String str = "uyjqgdbweceibclerufbejcerkjnfervcneouvb";
        String patter = "b";
        for(int i=0;i<str.length()-patter.length()+1;i++) {
            if(str.substring(i,i+patter.length()).equals(patter)) {
                System.out.println("Pattern Found between index : "+ i + " to "+ (i+patter.length()-1));
            }
        }
    }
}
