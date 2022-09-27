import java.util.Arrays;

public class tripletSumAnotherMethod {
    public static void main(String[] args) {
        int arr[]={2,4,7,5,6,3,9};
        int target=9;
        triplet(arr,target);
    }
    public static void triplet(int arr[],int target){
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            int j=i+1;
            int k=arr.length-1;
            while (j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if (sum==target){
                    System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
                    j++;
                    k--;
                    System.out.println();
                }
                else if (sum<target){
                    j++;
                }else {
                    k--;
                }
            }
        }
    }
}
