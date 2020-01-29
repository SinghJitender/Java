package CompaniesInterviewQuestions.JPMorgan;

/*
* Question - Given two employee names and an organisation hierarchy, print the number of connections between them.
* Example - Employee 1 - Arun, Employee 2 - Suraj.
* Organisation Hierarchy - 1. Payal/Kiran 2. Kiran/Suraj 3. Arun/Deepak 4. Deepak/Rohit 5. Rohit/Kiran
* Output -  3 ( Arun to Deepak, Deepak to Rohit, Rohit to Kiran, Kiran to Suraj )
* Explanatation - Between Arun to Suraj there are three people connecting them - Deepak,Rohit and Kiran.
* Note : Incase if there is no connection between two people print 0.
* Input - First Line contains two employee names between which connection has to be found. remaining lines will contain the organisation hierarchy.
* Sample Input -
* Arun/Suraj
* Payal/Kiran
* Kiran/Suraj
* Aurn/Deepak
* Deepak/Rohit
* Rohit/Kiran
* END
* Sample Output - 3
* */

import java.util.Hashtable;
import java.util.Scanner;

public class OrganizationHierarchy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mainPair = "";
        Hashtable<String,String> table = new Hashtable<>();
        int x = 0;
        String str="";
        while(!(str = input.next()).equals("END")){
            if(x == 0) {
                mainPair = str;
                x++;
                continue;
            }
            table.put(str.split("/")[0],str.split("/")[1]);
        }

        int result = findConnections(mainPair,table);
        System.out.println(result);
    }

    public static int findConnections(String mainPair, Hashtable<String,String> table) {
        int count = 0;
        String nameFrom = mainPair.split("/")[0];
        String nameTo = mainPair.split("/")[1];
        while (true) {
            System.out.println("Checking for name : "+nameFrom);
            if(table.containsKey(nameFrom)){
                if(table.get(nameFrom).equals(nameTo)){
                    System.out.println("FOUND!");
                    break;
                }
                count++;
                nameFrom = table.get(nameFrom);
            }
            if(!table.containsKey(nameFrom)) {
                System.out.println("Not Found! Ending at : "+nameFrom);
                count = 0;
                break;
            }
        }
        return count;
    }
}
