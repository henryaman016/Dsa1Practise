public class targetSumArray {
    public static void main(String[] args) {
        int arr[]={12,3,7,6,9,8};
        int target=15;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" " +arr[j] +" ");
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println("not found");
    }
}
