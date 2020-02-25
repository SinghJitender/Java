package Algorithms.Strings;

public class RabinKarpStringMatchingAlgo {

    public static void main(String[] args) {

        String s = "abcskdhfbgheilruwbfilfskbvgeiskvc";
        String p = "kvc";
        String temp = "";
        int patterHash = calculateHash(p);
        int currentHash = 0;
        boolean flag=false;
        System.out.println("Patter Hash : "+patterHash);
        for(int i=0;i<s.length();i++) {
            //System.out.println(s.charAt(i));
           if(i<p.length()) {
               temp += s.charAt(i);
           }
           if(i==p.length()-1){
               //System.out.println("Calcualting First Hash : "+temp);
               currentHash = calculateHash(temp);
           }
            if(i>=p.length()) {
                currentHash = currentHash - (((int)s.charAt(i-p.length())%96)*(int)(Math.pow(10,p.length()-1)));
                currentHash = currentHash * 10;
                currentHash += ((int)s.charAt(i)%96);
                //System.out.println("Recalculating - Hash now : "+currentHash);
            }
           if(patterHash == currentHash) {
               System.out.println("Hash Matched - Current Hash : "+ currentHash);
               if(p.equals(s.substring(i-p.length()+1,i+1))) {
                   System.out.println("Pattern found from index : "+(i-p.length()+1) + " to "+ (i));
                   flag=true;
               }
           }
        }
        if(flag==false){
            System.out.println("Pattern not found in string");
        }
    }
    public static int calculateHash(String a){
        int pow = a.length()-1;
        int hash = 0;
        for(int i=0; i<a.length();i++){
            //System.out.println(a.charAt(i) +  "  - " + ((int)a.charAt(i))%97 + " - "+ Math.pow(10,pow) );
            hash += ((int)a.charAt(i))%96 * Math.pow(10,pow);
            pow--;
        }
        return hash;
    }

}
