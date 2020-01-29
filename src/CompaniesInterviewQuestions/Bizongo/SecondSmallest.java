package CompaniesInterviewQuestions.Bizongo;

public class SecondSmallest {

    public static void main(String[] args) {
        int arr[] = {3,2,4,10,23,14,18,1,19,22,43,54,28,98,76,56};

        int smallest= Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest) {
                smallest=arr[i];
            }
            if((arr[i]-smallest)!=0 && (Math.abs(arr[i]-smallest)<secondSmallest && arr[i]<secondSmallest)){
                secondSmallest=arr[i];
            }
        }
        System.out.println("Smallest : "+smallest);
        System.out.println("Second Smallest  : "+secondSmallest);
    }
}
