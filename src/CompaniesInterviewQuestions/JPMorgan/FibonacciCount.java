package CompaniesInterviewQuestions.JPMorgan;

/*
* Question - Given two inputs START and END. Print the count of numbers that would occur in fibonacci series between those inputs
* Fibonacci Series - 0, 1, 1, 2, 3, 5, 8, 13, 21...
* Example - START - 5, END - 20
* Numbers that occur between 5 and 20 are - 5,8,13, So total count is 3.
* Output - 3
* */
public class FibonacciCount {
    public static void main(String[] args) {
        int result = countFibonacciNumbersFrom(5,20);
        System.out.println(result);
    }

    public static int countFibonacciNumbersFrom(int start, int end) {
        int count=0;
        int f1 = 0;
        int f2 = 1;
        while(true){
            int temp = f1+f2;
            if(temp>=start && temp<=end){
                count++;
            }
            if(temp > end){
                break;
            }
            f1=f2;
            f2=temp;
        }
        return count;
    }
}
