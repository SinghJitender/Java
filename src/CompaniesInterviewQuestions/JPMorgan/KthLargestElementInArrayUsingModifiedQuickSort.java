package CompaniesInterviewQuestions.JPMorgan;

import java.util.Arrays;

public class KthLargestElementInArrayUsingModifiedQuickSort {
    public static boolean flag = false;
    public static void main(String[] args) {
        int arr[] = {10,2,34,16,57,35,29,77,48,4,92,8,1};
        int k = 1;
        quickSort(arr,0,arr.length-1, k);
        System.out.println("Sorted Array : "+ Arrays.toString(arr));
        if(flag==false)
            System.out.println(k+"th smallest element found : "+arr[k]);
    }
    public static void quickSort(int arr[], int low, int high, int k) {
        int pivot;
        if(high>low) {
            pivot = partition(arr,low,high);
            if(pivot == k) {
                System.out.println(k+"th smallest element found : "+arr[k]);
                flag = true;
                return ;
            } else {
                quickSort(arr, low, pivot - 1, k);
                quickSort(arr, pivot + 1, high, k);
            }
        }
    }
    public static int partition(int arr[],int low,int high) {
        int left, right, pivot = arr[low];
        left = low;
        right = high;
        while(left<right) {
            while(arr[left] <= pivot && left<high)
                left++;
            while(arr[right] > pivot && right>low)
                right--;
            if(left<right)
                swap(arr,left,right);
        }
        arr[low] = arr[right];
        arr[right] = pivot;
        return right;

    }

    public static void swap(int[] arr,int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
