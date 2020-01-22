package Problems;

import java.util.ArrayList;

public class UnderstandingRecursion {

  private static int count=0;
  private static int maximum = 0;

  public static void main(String[] args) {
   // String text="ABC";
    //permutations(text,"");
    //ArrayList<Character> list = new ArrayList<>();
    //list.add('A');
    //list.add('B');
    //list = Arrays.asList('A','B');
    //possibleStrings(list,5,"");

    //allNumbersWithSum(1,30,0,"");
    //System.out.println("Total Combos :"+count);
    int[][] matrix = {{0,0,0,0,0},
                      {1,0,1,0,0},
                      {1,0,1,0,0},
                      {1,1,1,0,0},
                      {0,0,0,0,0}};
    longestsequenceof(1,matrix,0,0,0);
    System.out.println(maximum);
  }

  private static void recusrion(int n,int x) {
    System.out.println("\nStarting recursion : "+ n + " - Value of x :"+x);
    if(n==1) {
      System.out.println("Reached END - Value of 'x' now = "+x);
      return;
    }
    x=x+1;
    recusrion(n-1,x);
    System.out.println("Tracking back to "+n +"th recursion.");
    System.out.println("Value of 'x' now = "+x);
    //x=x+1;
  }

  private static void permutations(String text,String ans) {
    if(text.length()==0){
      System.out.println(ans);
      return;
    }
    for(int i=0;i<text.length();i++){
      char element = text.charAt(i);
      String ros = text.substring(0,i)+text.substring(i+1);
      permutations(ros,element+ans);
    }
  }

  private static void possibleStrings(ArrayList<Character> list, int k, String text) {
   if(text.length()==k){
      System.out.println(text);
      return;
    }
    for(int i=0;i<list.size();i++){
      possibleStrings(list,k,text+list.get(i));
    }
  }

  private static void allNumbersWithSum(int start, int num, int sum, String text) {
    if(num==sum){
      System.out.println(text);
      count++;
      return;
    }
    if(sum>num){
      return;
    }
    for(int i=start;i<=num;i++){
      allNumbersWithSum(i, num ,sum+i,text+i+" ");
    }

  }

  private static void longestsequenceof(int value, int[][] matrix, int indexi,int indexj,int max) {

    if(indexi>=matrix.length){
      return;
    }
    if(indexj>=matrix[0].length){
      return;
    }
    if(indexi<0){
      return;
    }
    if(indexj<0){
      return;
    }
    if(matrix[indexi][indexj]==value) {
      max=max+1;
    }
    if(max>maximum){
      maximum=max;
      System.out.println("Maximum till now : "+max);
    }
    for(int i=indexi;i<matrix.length;i++) {
      for(int j=indexj;j<matrix[i].length;j++) {
        if(matrix[i][j]==value) {
          System.out.println("Indexes : ("+i+","+j+")");
          longestsequenceof(value,matrix,i,j+1,max);
          longestsequenceof(value,matrix,i-1,j,max);
          longestsequenceof(value,matrix,i+1,j,max);
          longestsequenceof(value,matrix,i,j-1,max);
        }
      }
    }

  }
}
