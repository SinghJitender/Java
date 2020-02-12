package ConceptsCheck;

public class MergeSortTry {
    public static void main(String[] args) {
        int arr[] = {5,8,6,12,45,78,69,35,18,3,4,2,53,47,99,1};
        mergeSort(arr);
    }
    public static void mergeSort(int[] arr) {
        sort(arr,0,arr.length/2);
        sort(arr,arr.length/2+1,arr.length);
    }
    public static void sort(int arr[], int start, int end){

    }
}
