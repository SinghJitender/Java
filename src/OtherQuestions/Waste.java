package OtherQuestions;

import java.util.Scanner;

public class Waste {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();

    for(int i=0;i<str.length();i++) {
      if(!(str.charAt(i)+"").equals(" ")) {
        int x = (int) str.charAt(i) % 96;
        for (int j = 0; j < x; j++) {
          System.out.print(str.charAt(i));
        }
        System.out.print(" ");
      }
    }
  }
}
