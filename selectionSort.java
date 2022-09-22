public class selectionSort {
    public static void main(String[] args) {
        int arr[]={84,9,57,34,64,15,2,54,25,12,52};

        for (int i =0;i<arr.length;i++){
            int min_index=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
