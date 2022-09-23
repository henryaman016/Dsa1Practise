import java.util.Arrays;

public class thirdLargest {
    public static void main(String[] args) {
        int arr[] = {45, 7, 8, 46, 854, 26, 5, 412, 6, 125, 5};

        int n = arr.length;

        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[n - 2]);

        }

    }
}
