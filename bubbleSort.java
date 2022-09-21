public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={15,10,16,30,57,25,50,12};

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
