package Problems;

public class CheckSubarryWithSumK {
    public static void main(String[] args) {
        int start=0;
        int arr[] = {2,1,4,7,9,8};
        int k=12;
        int sum=0;
        int i=0;
        while(true){

            if(sum==k){
                i=i-1;
                break;
            }
            if(sum>k){
                sum=sum-arr[start];
                start=start+1;
            }
            if(arr.length<=i){
                start=-1;
                i=-1;
                break;
            }
            if(sum<k){
            sum=sum+arr[i];
            i++;
            }

        }

        System.out.println("Start : "+start+" End :"+i);

    }
}
