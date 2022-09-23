public class maxSecMinSecElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        secondLargeSecondMin(arr);
    }
    public static void secondLargeSecondMin(int []arr){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;


        for (int i=0;i<arr.length;i++){
            max1=Math.max(max1,arr[i]);
            min1=Math.min(min1,arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            if (max2<arr[i] && max1>arr[i]){
                max2=Math.max(max2,arr[i]);
            }
            if (min1!=arr[i] && min2>arr[i]){
                min2=Math.min(min2,arr[i]);
            }
        }
        System.out.println("Second Largest Element : " + max2);
        System.out.println("Second Minimum Element : " + min2 );
    }
}
