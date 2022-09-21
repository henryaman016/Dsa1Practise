import java.util.Arrays;

public class secLargest {
    public static int getSecondLargest(int[] arr,int total){
        Arrays.sort(arr);
        return arr[total-2];
    }
    public  static void main(String args[]){
        int a[]={1,2,5,6,8,7,9,4};
        int b[]={5,6,9,8,7,4,2,3,1};
        System.out.println(getSecondLargest(a,7));
        System.out.println(getSecondLargest(b,9));
    }
}
