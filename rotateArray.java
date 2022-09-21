public class rotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,9,4};
        int n= arr.length;
        int d=2;

        int b[]=new int[n];
        for (int i=0;i<n-d;i++) {
            b[i] = arr[i + d];

        }
            for (int i=0;i<d;i++){
                b[n-d+i]=arr[i];
        }
            for (int i=0;i<n;i++){
                arr[i]=b[i];
            }

                for (int i=0;i<n;i++){
                    System.out.println(arr[i]+ " ");
            }
    }
}
