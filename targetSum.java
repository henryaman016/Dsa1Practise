public class targetSum {
    public static void main(String args[]){
        int arr[]={2,5,4,6,8,4,6,2,7,8,9,2};
        int target=13;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+ " + "+arr[j] + " = " + target);
                    return;
                }
            }
        }
        System.out.println("not found");
    }
}
