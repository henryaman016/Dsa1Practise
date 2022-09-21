public class threeLargeElement {
    public static void main(String[] args) {
        int arr[]={10,56,92,18,72,24,15,45};
        int n=arr.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;


        for (int i=0;i<n;i++){
            max1=Math.max(arr[i],max1);
        }
        for (int i=0;i<n;i++){
            if (arr[i]<max1){
                max2=Math.max(arr[i],max2);
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]<max1 && arr[i]<max2){
                max3=Math.max(arr[i],max3);
            }
        }
        System.out.println("1st Largest Element Of The Array "+ max1);
        System.out.println("2nd Largest Element Of The Array "+ max2);
        System.out.println("3rd Largest Element Of The Array " + max3);
    }
}
