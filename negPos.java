import java.util.Scanner;

public class negPos {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};


        for (int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < 0) {
                    if (i != j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

                    j++;
                }
        }


            System.out.print(arr[i]+" ");
        }
    }
}


