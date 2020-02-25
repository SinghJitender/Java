package Algorithms.Strings;

import java.util.Map;

public class RabinKarpStringMatchingAlgo {

    public static void main(String[] args) {

        String s = "abcskdhfbgheilruwbfvilfskbvgeiskvc";
        String p = "fvil";

        System.out.println(calculateHash(p));


    }
    public static int calculateHash(String a){
        int pow = a.length()-1;
        int hash = 0;
        for(int i=0; i<a.length();i++){
            System.out.println(a.charAt(i) +  "  - " + ((int)a.charAt(i))%97 + " - "+ Math.pow(10,pow) );
            hash += ((int)a.charAt(i))%97 * Math.pow(10,pow);
            pow--;
        }
        return hash;
    }

}
