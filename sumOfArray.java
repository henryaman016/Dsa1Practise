public class sumOfArray {
    public static void main(String args[]) {
        int arr[] = {4, 6, 5, 20, 32, 7, 16, 3};
        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2!= 0) {
                sum = sum + arr[i];
            }
        }
            System.out.println(sum);
        }
    }

