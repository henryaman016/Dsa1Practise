public class targetSum {
    public static void main(String args[]){
        int arr[]={5,2,8,3,7,1,6};
        int target=13;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                    return;
                }
            }
            System.out.println("not found");
        }
    }
}
