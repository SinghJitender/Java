package CompaniesInterviewQuestions.Bizongo;

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
                      {1,1,1,0,0},
                      {1,0,1,0,0},
                      {1,0,1,0,0},
                      {0,0,1,0,0}};
    int value=1;
    int max=0;
    for(int i=0;i<matrix.length;) {
      for(int j=0;j<matrix[i].length;) {
        if(matrix[i][j]==value) {
          max=max+1;
          System.out.println("Indexes : ("+i+","+j+")");
          if(j+1<matrix[i].length) {
            System.out.println("Now Setting Index : (" + i + "," + (j+1) + ") max = "+max);
            longestsequenceof(value, matrix, i, j + 1, max + 1, i, j);
          }
          if(i-1>=0) {
            System.out.println("Now Setting Index : (" + (i-1) + "," + j + ") max = "+max);
            longestsequenceof(value, matrix, i - 1, j, max + 1, i, j);
          }
          if(i+1<matrix.length) {
            System.out.println("Now Setting Index : (" + (i+1) + "," + j + ") max = "+max);
            longestsequenceof(value, matrix, i + 1, j, max + 1, i, j);
          }
          if(j-1>=0) {
            System.out.println("Now Setting Index : (" + i + "," + (j-1) + ") max = "+max);
            longestsequenceof(value, matrix, i, j - 1, max + 1, i, j);
          }
          max=0;
        }
        j=j+1;
      }
      i=i+1;
    }


    //longestsequenceof(1,matrix,0,0,0);
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

  private static void longestsequenceof(int value, int[][] matrix, int indexi,int indexj,int max, int starti, int startj) {

    if(indexi==starti && indexj==startj){
      if(max>maximum){
        maximum=max;
        //System.out.println("Maximum till now : "+max);
      }
      return ;
    }
    if(indexi>=matrix.length){
      if(max>maximum){
        maximum=max;
        //System.out.println("Maximum till now : "+max);
      }
      return ;
    }
    if(indexj>=matrix[0].length){
      if(max>maximum){
        maximum=max;
        //System.out.println("Maximum till now : "+max);
      }
      return ;
    }
    if(indexi<0){
      if(max>maximum){
        maximum=max;
        //System.out.println("Maximum till now : "+max);
      }
      return ;
    }
    if(indexj<0){
      if(max>maximum){
        maximum=max;
        //System.out.println("Maximum till now : "+max);
      }
      return ;
    }
    if(matrix[indexi][indexj] == value) {
     // max=max+1;
      if(indexj+1<matrix[indexi].length) {
        System.out.println("Now Setting Index : (" + indexi + "," + (indexi+1) + ") max = "+max + " Start i : "+starti + " startj :" +startj);
        longestsequenceof(value, matrix, indexi, indexj + 1, max + 1, starti, startj);
      }
      if(indexi-1>=0) {
        System.out.println("Now Setting Index : (" + (indexi-1) + "," + indexj + ") max = "+max + " Start i : "+starti + " startj :" +startj);
        longestsequenceof(value, matrix, indexi - 1, indexj, max + 1, starti, startj);
      }
      if(indexi+1<matrix.length) {
        System.out.println("Now Setting Index : (" + (indexi+1) + "," + indexj + ") max = "+max + " Start i : "+starti + " startj :" +startj);
        longestsequenceof(value, matrix, indexi + 1, indexj, max + 1, starti, startj);
      }
      if(indexj-1>=0) {
        System.out.println("Now Setting Index : (" + indexi + "," + (indexj-1) + ") max = "+max + " Start i : "+starti + " startj :" +startj);
        longestsequenceof(value, matrix, indexi, indexj - 1, max + 1, starti, startj);
      }
      if(max>maximum){
        maximum=max;
        //System.out.println("Maximum till now : "+max);
      }
    }

    return ;


  }
}
