package ConceptsCheck;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {10,2,34,16,57,35,29,77,48,4,92,8,1};
        System.out.println("Array Before Sorting : "+ Arrays.toString(arr));
        System.out.println("Note : Always picking first element as Pivot");
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int arr[], int low, int high) {
        int pivot;
        if(high>low) {
            pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
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
        System.out.println("Pivot : "+pivot);
        System.out.println("Array Now  : "+ Arrays.toString(arr));
        return right;

    }

    public static void swap(int[] arr,int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
