package ConceptsCheck;

import java.util.Arrays;

public class MergeSortTry {
    public static void main(String[] args) {
        int arr[] = {5,8,6,12,45,78,69,35,18,3,4,2,53,47,99,1};
        System.out.println("UnSorted : "+Arrays.toString(arr));
        mergeSort(arr,new int[arr.length],0,arr.length);
        System.out.println("Sorted : "+Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int temp[],int start,int end) {
        int mid;
        if( end > start ) {
            mid = ( end + start ) / 2;
            mergeSort(arr, temp, start, mid);
            mergeSort(arr, temp, mid+1, end);
            sort(arr,temp, start,mid+1,end);
        }
    }

    public static void sort(int arr[],int temp[], int start,int mid, int end){
        int size = end-start;
        int temp_pos = start;
        int left_end = mid-1;
        System.out.println("Start : "+start + " Mid : "+mid+ " End : "+end+" Size : "+size);

        while( (start <= left_end) && (mid <= end) ) {
            if(arr[start] <= arr[mid]) {
                temp[temp_pos] = arr[start];
                temp_pos += 1;
                start += 1;
            }
            else {
                temp[temp_pos] = arr[mid];
                temp_pos += 1;
                mid += 1;
            }
        }

        while(start <= left_end) {
            temp[temp_pos] = arr[start];
            temp_pos += 1;
            start += 1;
        }

        while(mid <= end) {
            temp[temp_pos] = arr[mid];
            temp_pos += 1;
            mid += 1;
        }

        for(int i = 0; i < size; i++) {
            arr[end] = temp[end];
            end -= 1;
        }
    }
}
