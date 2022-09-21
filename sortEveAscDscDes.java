import java.util.Arrays;

public class sortEveAscDscDes {
    public static void main(String[] args) {
        int arr[] = {44, 16, 39, 27, 8, 45, 76, 21, 51, 32, 25, 48, 20};

        for (int i = 0; i < arr.length - 1; i++) {
            Arrays.sort(arr);
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {


            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");

            }
        }
    }
}
