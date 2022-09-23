public class moveAllZeroEnd {
    static void pushZero(int arr[],int n){
        int count=0;
        for (int i=0;i<n-1;i++){
            if (arr[i]!=0)
                arr[count++]=arr[i];
            while (count<n)
                arr[count++]=0;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,9,8,4,0,0,27,0,6,0,9};
        int n=arr.length;
        pushZero(arr,n);
        System.out.println("array after pushing zero to back ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
