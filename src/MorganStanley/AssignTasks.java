package MorganStanley;

import java.util.*;

import static java.util.Arrays.asList;

public class AssignTasks {
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    int totalTasks = sc.nextInt();
    List<Integer> temp = new ArrayList<Integer>();

    Hashtable<String, ArrayList<Integer>> developers = new Hashtable<>();
   /* developers.put("Satish", asList(5,7,8);
    developers.put("Harish", asList(6,2,6,2));
    developers.put("Shweta", asList(8,9,1,4));
    developers.put("Shipla", asList(1,4,5,4));*/

    temp.addAll(Arrays.asList(5,7,8,9,6,2,6,2,8,9,1,4,1,4,5,4));

    int iterations = 0;
    HashSet<Integer> indexes = new HashSet<>();
    while(iterations<=totalTasks) {
      for(String key: developers.keySet()) {
        int min = (findmin(developers.get(key)))[0];
      }
    }
  }

  private static int[] findmin(ArrayList<Integer> list){
    int min = Integer.MAX_VALUE;
    int index = 0;
    for(int i=0;i<list.size();i++) {
      if(list.get(i)<min){
        min=list.get(i);
      }
    }
    int arr[]= new int[2];
    arr[0] = min;
    arr[1] = index;
    return arr;
  }



}
