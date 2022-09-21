import java.util.Arrays;

public class thirdLargestEle {
public static int getThirdLargest(int arr[],int total){
    Arrays.sort(arr);
    return arr[total-3];
}
    public static void main(String[] args) {
        int arr[]={10,22,50,62,31,25,47};
        System.out.println(getThirdLargest(arr,7));
    }
}
