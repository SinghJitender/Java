package Algorithms.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class FiniteAutomata_BuildStateMachine {
  public static void main(String[] args) {
    String pattern = "ababaca";
    Hashtable<String ,Integer> table[] = new Hashtable[pattern.length()];
    for(int i=0;i<pattern.length();i++){
      table[i] = new Hashtable<>();
    }

    String temp="";
    Set<Character> set = new HashSet<>();

    for(int i=0;i<pattern.length();i++) { //states i
      String waste = "";
      set.add(pattern.charAt(i));
      table[i].put(pattern.charAt(i)+"",i+1);
      waste = temp;
      temp += pattern.charAt(i);
      System.out.println("\nIteration : "+ i + " -- Set : "+set);
      System.out.println("Current Pattern : "+temp +"  Last Pattern : "+waste+"\n");
      for(Character key: set) {
        String x = waste+key;
        System.out.println("\tTrying for string : " + x+ " pattern : "+temp);
        for(int j=0;j<=i;j++) {
          String matchWith = x.substring(j);
          System.out.println("\t\tx : "+matchWith);
          for(int k=0;k<temp.length()-matchWith.length()+1;k++) {
            if(matchWith.equals(temp)) {
              System.out.println("\t\tPrefix found :  Next state from " +temp+" if char="+key+" will be "+(i+1));
            }
          }

        }
      }

      //System.out.println(temp + " - " + pattern);
    }
    System.out.println(Arrays.toString(table));
  }
}
