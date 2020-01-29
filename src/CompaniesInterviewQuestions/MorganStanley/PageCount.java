package CompaniesInterviewQuestions.MorganStanley;

import java.util.ArrayList;
import static java.util.Arrays.asList;

public class PageCount {

  public static void main(String[] args) {
    ArrayList<Integer> pages = new ArrayList<>();
    pages.addAll(asList(5,0,1,3,2,4,1,0,5));
    //pages.addAll(asList(5,5,5,5,5,5,5));
    //pages.addAll(asList(6,6,6,6,5,5,5));
    //pages.addAll(asList(6,5,6,6,5,5,5));
    int pageCount=6;
    //int pageCount=1;

    ArrayList<Integer> memory = new ArrayList<>();
    int index=-1;
    int pageFault=0;

    for(int i=0;i<pages.size();i++) {
      // check if memory already contains the element. if not then proceed with if condition else skip.
      if(!memory.contains(pages.get(i))) {
        // checks if index is withing the maximum memory size limit i.e page count
        // if not then set it back to 0 else increment
        if(index+1>=pageCount) {
          index=0;
        } else {
          index++;
        }
        // increases total page fault.
        pageFault+=1;

        if(memory.size()>=pageCount) {
          System.out.println("Page Number "+pages.get(i)+ " is required, replaces LRU "+pages.get(index) +"  Page Fault : "+pageFault);
          memory.remove(index);
          memory.add(index,pages.get(i));
        }else {
          System.out.println("Memory Allocated with Page : "+pages.get(i)+ " Page Fault : "+pageFault);
          memory.add(pages.get(i));
        }
      } else {
        System.out.println("Page "+ pages.get(i) +" Already exists in memory");
      }

    }
    System.out.println("\nTotal Page Faults : "+ pageFault);
  }
}
