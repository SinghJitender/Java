package Algorithms.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class FiniteAutomata_BuildStateMachine {
  public static void main(String[] args) {
    String pattern = "ababaca";
    pattern=pattern+"/";
    Hashtable<String ,Integer> table[] = new Hashtable[pattern.length()];
    String states[] = new String[pattern.length()+1];

    for(int i=0;i<pattern.length();i++){
      table[i] = new Hashtable<>();
    }

    String temp="";
    Set<Character> set = new HashSet<>();

    for(int i=0;i<pattern.length();i++) { //states i
      String waste = temp;
      if(pattern.charAt(i)!='/') {
        set.add(pattern.charAt(i));
        table[i].put(pattern.charAt(i) + "", i + 1);
        temp += pattern.charAt(i);
        states[i] = temp;
      }

      //System.out.println("\nIteration : "+ i + " -- Set : "+set);
      //System.out.println("Current Pattern : "+temp +"  Last Pattern : "+waste+"\n");

      for(Character key: set) {
        String x = waste+key;
        //System.out.println("\tTrying for string : " + x);
        for(int j=x.length()-1;j>=0;j--) {
          String str = x.substring(j);
          //System.out.println("\t\tComparing "+str);
          for(int k=0;k<str.length();k++){
            if(str.equals(states[k])) {
              //System.out.println("\t\tString matches with state["+k+"]="+states[k]);
              if(pattern.charAt(i)!=key )
                table[i].put(key+"",k+1);
            }
          }
        }

      }

      //System.out.println(temp + " - " + pattern);
    }
    //System.out.println(Arrays.toString(table));

    for(int i=0;i<table.length;i++) {
      System.out.println("State "+i+ " :");
      for(String key : table[i].keySet()){
        System.out.println(" \tIf '" +key + "' go to state " + table[i].get(key) );
      }
    }
  }
}
