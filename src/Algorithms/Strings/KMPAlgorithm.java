package Algorithms.Strings;

import java.util.Arrays;

public class KMPAlgorithm {
    public static void main(String[] args) {
       // String pattern = "ababaca";
       // String pattern = "aaaaaaab";
       // String pattern = "abcdabeabf";
       // String pattern = "abcdeabfabc";
       // String pattern = "aabcadaabe";
        String pattern2 = "aaaabaacd";
        String text2 = "aaaaaaaaaaaabaacdeabababceb";
        String pattern = "ababd";
        String text = "ababcabcabababe";

        int arr[] = buildPrefixTable(pattern);

        System.out.println("Pattern Found : "+ findPattern(pattern,text,arr));

        int arr2[] = buildPrefixTable(pattern2);
        System.out.println("Pattern Found : "+ findPattern(pattern2,text2,arr2));

    }

    public static int[] buildPrefixTable(String pattern) {
        int arr[] = new int[pattern.length()];
        arr[0]=0;
        int j=0;
        for(int i=1;i<pattern.length();i++) {
            if(pattern.charAt(i)==pattern.charAt(j)) {
                j = j+1;
                arr[i] = j;
            }
            else if(pattern.charAt(i)!=pattern.charAt(j)) {
                arr[i] = 0;
                j = 0;
            }
        }
        return arr;
    }

    public static boolean findPattern(String pattern, String text, int []prefixTable) {
        System.out.println("Prefix Table : "+Arrays.toString(prefixTable));
        System.out.println("Pattern Length : "+ pattern.length() + " - Pattern :"+pattern);
        System.out.println("Text Length: "+text.length() + " - Text :"+text);

        boolean result = false;
        int patternindex = -1;
        for(int i=0;i<text.length();i++) {
            if(text.charAt(i)==pattern.charAt(patternindex+1)) {
                patternindex+=1;
                if(patternindex+1 == pattern.length()) {
                    result = true;
                    break;
                }
            }
            else if(text.charAt(i)!=pattern.charAt(patternindex+1)) {
                if(patternindex!= -1)
                    patternindex = prefixTable[patternindex];
                //System.out.println("From index "+i+" in text. Retracing to index :"+patternindex+" in pattern ");
            }

        }
        return result;
    }


}
