public class selectionSort {
    public static void main(String[] args) {
        int arr[]={42,62,9,7,13,6,4,8,42,25};
        int n=arr.length;
        System.out.println("Original array");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");


        }

        for (int i=0;i<n-1;i++){
            int min_index=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
