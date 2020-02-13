package ConceptsCheck;

import org.w3c.dom.ls.LSOutput;

public class BinarySearchUsingRecusrion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9,10,11,23,26,28,39,45,48,59,60,70,90};
        binarySearch(arr,90 );
    }

    public static void binarySearch(int arr[],int item){
        binarySearchUtil(arr,item,0,arr.length);
    }

    private static void binarySearchUtil(int[] arr,int item, int beg, int end) {
        int mid = (end+beg)/2;
       // System.out.println("Mid Value : "+arr[mid] + " End : "+ end + " Beg : "+beg + " Item : "+item);
        if(mid<beg || mid>end) {
            System.out.println("Not Found");
            return;
        }

        if(arr[mid]==item) {
            System.out.println("Found");
            return;
        }

        if(arr[mid]>item)
            binarySearchUtil(arr,item,beg,mid-1);
        else
            binarySearchUtil(arr,item,mid+1,end);

    }

}
