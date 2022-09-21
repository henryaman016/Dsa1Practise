public class minMaxArray {
    public static void main(String[] args) {
        int arr[] = {82, 56, 9, 7, 13, 65, 12, 36, 92};
        int min = arr[0];
        int max = arr[0];
        int pos = -1;
        int ros = -1;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                pos = i;
        }

                if (arr[i] > max) {
                    max = arr[i];
                    ros = i;
//                }

            }
        }
        System.out.println("minimum no. is " + min);
        System.out.println("position of minimum no. is " + pos);


        System.out.println("maximum no. is " + max);
        System.out.println("position of maximum no. is "+ros);

    }
    }
