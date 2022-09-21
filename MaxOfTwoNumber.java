public class MaxOfTwoNumber {
    public static void main(String[] args) {
        int arr[]={6,19,7,31,36,59,74,25,60};
        int n=arr.length;

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;


        for (int i=0;i<arr.length;i++){
            max1=Math.max(arr[i],max1);
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]<max1){
                max2=Math.max(arr[i],max2);
            }
        }
        for (int i=0; i<arr.length;i++){
            if(arr[i]<max1 && arr[i]<max2){
                max3=Math.max(arr[i],max3);
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }
}
