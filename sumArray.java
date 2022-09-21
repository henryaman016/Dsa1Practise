public class sumArray {
    public static void main(String args[]){
        int arr[]={5,3,4,7,8,9,64,26,15,56};

        int sum=0;

        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==0)
            if(arr[i]%2!=0)
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
