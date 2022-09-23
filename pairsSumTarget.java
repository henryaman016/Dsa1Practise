import java.util.Arrays;

public class pairsSumTarget {
    public static void main(String[] args) {
        int arr[]={1,5,10,20,8,12,16,25};
        int target=20;
        sumElement(arr,target);
    }
    public static void sumElement(int arr[],int target){
        int n=arr.length;
        Arrays.sort(arr);
        int i=0;
        int j=n-1;

        while (i<j){
            int sum=arr[i]+arr[j];
            if (sum==target){
                System.out.println(arr[i]+" "+arr[j]);
                System.out.println();
                i++;
                j--;
            }
            else if (sum<target){
                i++;
            }
            else {
                j--;
            }
        }
    }
}
