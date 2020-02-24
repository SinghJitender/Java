package OtherQuestions;

/*
* Question - Given an array of positive integers, all numbers occur an even number of times except one which occur odd number of times
* Find the number in O(n) time and constant space
* */

public class OccuringOddTimes {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,1,3,3};
        int result = 0;
        for(int i=0;i<arr.length;i++) {
            result ^= arr[i];
        }
        System.out.println("Number occuring odd number of times : " + result);
    }
}
