import java.util.Arrays;

public class trdLargestEle {
    public static int getTrdLargest(int arr[], int total){
        Arrays.sort(arr);

        return arr[total-3];
    }
    public static void main(String[] args) {
        int arr[]={14,6,84,1,5,63,51,45,60,81,5,25,15,62};
        System.out.println(getTrdLargest(arr,14));

    }
}
