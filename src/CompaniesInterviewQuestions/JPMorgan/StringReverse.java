package CompaniesInterviewQuestions.JPMorgan;

/*
* Question - Program to reverse the string without using any inbuilt data structure. (Can use inbuilt classes )
* Is there a way to do it without using inbuilt classes as well?
* */
public class StringReverse {
    public static void main(String[] args) {
        String inputString= "ABCD";
         // Using inbuilt class - StringBuilder
        StringBuilder builder = new StringBuilder(inputString);
        System.out.println(builder.reverse());

        // Without using StringBuilder as well as any data structure
        String output = "";
        for(int i = 0;i<inputString.length();i++){
            output = inputString.charAt(i) + output;
        }
        System.out.println(output);
    }
}
