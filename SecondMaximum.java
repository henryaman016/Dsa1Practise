import java.util.Arrays;

public class SecondMaximum {
    public static void main(String[] args) {
        int arr[] = {45, 8, 47, 14, 56, 39, 27, 45, 9, 84, 36, 61, 51};
        int n = arr.length;

        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.println(arr[n - 3]);


            System.out.println(arr[n - 2]);


            System.out.println(arr[n - 1]);
        }
    }
}