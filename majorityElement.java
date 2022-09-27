public class majorityElement {
    public static void main(String[] args) {
        int arr[]={3,2,4,2,2,2,3};
        majorityElement(arr);

    }
    public static void majorityElement(int arr[]) {
        int count = 0;
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                number = arr[i];
            }
            if (arr[i] == number) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(number);

    }
}
