public class SecondLargestElement {
    public static void main(String args[]) {
        int arr[] = {40, 56, 29, 7, 23, 65, 97, 48, 62};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//            System.out.print(arr[i]+" ");


//                    System.out.println("Second Largest element is " + arr[n - 2]);
        System.out.println("Second largest element is " +arr[n-2]+" ");
        System.out.print("Second smallest element is " +arr[1]+" ");



    }
}