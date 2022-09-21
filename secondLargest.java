public class secondLargest {
    public static void main(String args[]){
        int arr[]={46,26,82,65,19,27,33,12,20,14,25,16};
        int temp;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]+" ");
        }
    }
}
