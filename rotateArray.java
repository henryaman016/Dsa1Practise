public class rotateArray {
    public static void main(String args[]){
        int arr[]={1,7,5,6,8,2,4,9,3};
        int n=arr.length;
        int d=5;

        int b[]=new int[n];
        for(int i=0;i<n-d;i++)
            b[i]=arr[i+d];

        for (int i=0;i<d;i++){
            b[n-d+i]=arr[i];
        }
        for (int i=0;i<n;i++)
            arr[i]=b[i];

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+ " ");
    }
}
